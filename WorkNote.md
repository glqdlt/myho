자바 제네릭이 필요한 경우와 필요하지 않은 경우

클래스 내부 필드들의 타입을 공통화 하고 싶은 경우 o

런타임 시점 이후에 필드 타입을 결정 짓고 싶은 경우 o

Collection<T> 의 경우는 재밌는 것이, 원소 집합들이 다 같은 T 의 타입이어야 하는 경우는 가능 o

Collection<T<V>> 이 경우는 얘기가 달라짐, T의 하위 타입이 모두 T일 수는 있지만, 자기 자신의 제네릭은 각 하위 타입마다 다르기 때문

Collection<T<String>>, Collection<T<Long>> 이런 경우를 의미함

Collection<MyClass<String> 으로 제네릭이 타입 확정되면, MyClass<String> 만 받을수 있음 MyClass<Long> 은 당연히 안됨.

Collection<MyClass<?>> 이런 경우 때문에 나오는 것이 ? 와 같은 와일드 카드임.

그런데 이런 경우가 가장 머리아픔

단순히 브릿지로 연결하는 형태의 타입이 있다고 가정함, HashMap 처럼 Key 타입은 같으나 Value 타입만 다른경우

SomeBridgeClass<T extends MyTypeClass<V>,V>

위의 경우는 머리가 아파짐

Collection<SomeBridgeClass<StringMyTypeClass<String>,String>> 이렇게 선언이 되게 되는데..

이러면 StringMyTypeClass<String>,String> 이라는 BridgeClass 하위 타입만 콜렉션 집합에 담을수있게 됨..


Collection<BridgeClass<?>,?>> 그러면 이렇게 선언하면 여러 하위 타입들을 받을수는 있지만..

하위타입의 Key와 Value 를 묶기 위해 선언한 <T extends MyTypeClass<V>,V> 가 깨져버림

위 와일드 카드로 선언하면 Collection<BridgeClass<String>,<Long>> 이렇게도 가능하다는 얘기가 된다.

이래서 이걸 처리하면, Collection<WrappingBridgeClass<T extends BridgeClass<?,?>> 이런식으로

이미 2개를 묶은 하위구현체 BridgeClass 구현타입을 받을수있게 하면 문제가 해결된다.

다만 이렇게 되면 하위타입이 조합 별로 기하급수적으로 늘어나게 되면서 머리가 아파진다.

이런 문제 때문에 그냥 Object 로 해버리고 setValue(Object value){ getAbstractTypeValueCheck(value); this.value = value;} 를 값을 넣을 때

특정 클래스타입을 받을수있게 처리하는 식으로도 한다. 

다만 이렇게 하면 코딩 시점에는 타입 체크를 할수가 없고, 런타임 시점 이후에 getAbstractTypeValueCheck() 를 통해서만 확인할 수 있다.

마치 동적언어 처럼 동작하게 되니, 버그나 실수를 야기할수도 있다. 

골때린다 자바.

근데 곰곰히 생각해보니깐, Key<T> Value<T> 라면

```
class KeyValueBridgeClass<T>{

    private Key<T>;
    
    private Value<T>;

}
```

이렇게 하면 되는거아닌가?

내가 멍청했다.


----

ORM 에서 상속이란 참 어려운 문제이다.

JPA 기준이지만 기본적으로 1뎁스의 상속은 ORM에서 구현이 가능하다. 

다만 다중상속(다중구현이 정확하다) 이나 2뎁스 이상의 상속은 어렵다.

예를 들면 아래와 같다.


case1) 아래는 JPA에서 구현이 가능하다.
```

AbstractEntity <|-- Entity1
AbstractEntity <|-- Entity2

```

case2) 다만 아래의 경우 불가능하다.

```

AbstractEntity <|-- Entity1
AbstractEntity <|-- Entity2

Entity1 <|-- Entitiy1_1

```

case2의 경우에는 아래처럼 확장이 아닌 연관 관계(Association(Aggregation))로 접근하면 흉내가 가능하다.

```

AbstractEntity <|-- Entity1
AbstractEntity <|-- Entity2

Entity1 <-- Entitiy1_1
Entity1 <-- Entitiy1_2

```
이제 문제는 정수증가값 identity 에 대한 고민이 생긴다. 

보통 검색을 한다면, 같은 상위 타입을 묶어서 검색하게 되는 데,

DB 에서는 인스턴스 고유 식별을 PK에 의존하게 됨으로, 단순정수값이 중복되면 안된다. 이게 무슨말이냐면..

tb_abstract_entity, auto identity last 2

entity1_1, auto indentity last 1

2테이블이 서로 분리되어 있고, JPA 사양에 따라 상속관계에서만 PK(@Id) 를 공유context 로 사용되기 떄문에

순차 증가가 따로 놀게 되서 싱크가 맞지 않게 된다.

이렇게 되면 같은 타입을 검색하기 위해서는 union을 한다던지로 접근해야 하는데, 이는 객체지향적이지 않는 방법이다(자바로 치면 결국, 각 타입에 맞는 저장소(repository)를 구현하고 해당 결과 collection들을 merge 하는 식으로)

이 부분에 대해서 많은 고민이 생기게 된다.

결국은   

```

AbstractEntity <|-- Entity1
AbstractEntity <|-- Entity2
AbstractEntity <|-- Entity3
AbstractEntity <|-- Entity4

Entity3 <-- Entitiy1_1
Entity4 <-- Entitiy1_2

class Entity3 extends AbstractEntity{

    @Id
    @GenerateValue(identity)
    private Long id;

    @OneToOne()
    private Entitiy1_1 ref;

}

class Entitiy1_1 extends AbstractEntity{

    @Id
    @GenerateValue
    private Long id;

}

```

이런식으로 Entity1 의 하위 타입을 연결하는 Entity를 만들어서 분리 된 식별자를 묶는 엔티티가 생겨나게 된다.

클래수 개수가 많아지는 건 어떻게든 하더라도, 문제는 검색이다.

예를 들어서 브릿지 클래스에는 원본 객체를 가르키는 포인터만 있을 뿐인데, 예를 들어 getTile() 이라는 메소드가 브릿지에도 원본레퍼런스에도 있다면

브릿지에서 레퍼런스의 getTitle()를 가르키도록 하면 자바 기반에서는 문제가 없다.

다만 DB에는 이러한 필드 참조 개념이 없기에 (JOIN을 이야기하는게 아니다) 조회 쿼리를 만들때 문제가 발생한다.

JPA에서는 일단 동작은 하지만, 오버라이딩된 getTitle()로 참조객체의getTitle()을 호출하는 식으로 처리하면 N+1 이 무조건 일어나게 된다.

또한 오버라이딩이 되면서, 기존에 super.getTitle() 을 가르키던 필드는 DB 테이블에 null로 들어가게 된다.

이러면 데이터 모양새가 굉장히 이상해진다. 결국은 이렇게 되면, 추가 필드가 필요한  Entitiy1_1 이나 Entitiy1_2의 경우는 

필요한 추가 필드부분만 따로 객체를 뽑아서 연결하는 식으로 해야 한다.

이렇게 되면 방금까지는 브릿지 클래스의 역활이, 확장 구현체를 가르키는 클래스 였지만

이제부터는 브릿지 클래스의 역활은, 확장 구현체는 브릿지 클래스 자신이 되고, 필요한 확장 필드를 가르키는 브릿지 역활을 한다.

이렇게 되면 자바스크립트의 믹스인과 같은 또는 스칼라의 형질처럼 처리가 된다.

