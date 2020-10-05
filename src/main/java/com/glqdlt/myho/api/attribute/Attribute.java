package com.glqdlt.myho.api.attribute;

public interface Attribute<T>{
    Integer getAttributeType();

    String getName();

    T getValue();

    default Integer getOrder(){
        return 0;
    };

}
