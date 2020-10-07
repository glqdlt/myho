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