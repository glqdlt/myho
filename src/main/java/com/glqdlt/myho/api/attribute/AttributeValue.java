package com.glqdlt.myho.api.attribute;

public interface AttributeValue<V> {

    V getValue();

    default Boolean valid(V t) {
        return t != null;
    }

}
