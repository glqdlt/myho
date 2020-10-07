package com.glqdlt.myho.api.attribute;

import com.glqdlt.myho.api.attribute.AttributeKey;

public interface AttributeFormType<T> extends AttributeKey<T> {
    Class<T> getValueType();
}
