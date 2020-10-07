package com.glqdlt.myho.api.attribute;

import java.util.function.Function;

public interface AttributeFormType<T> {
    Class<T> getValueType();

    Function<String, String> getDrawSourceResolver();
}
