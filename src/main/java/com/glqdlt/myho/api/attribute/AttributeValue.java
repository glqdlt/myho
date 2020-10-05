package com.glqdlt.myho.api.attribute;

public interface AttributeValue<T>{
    Integer getAttributeFormType();

    T getValue();

    default Boolean valid(T t){
        return t != null;
    };

}
