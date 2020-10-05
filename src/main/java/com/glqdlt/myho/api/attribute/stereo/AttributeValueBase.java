package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.attribute.AttributeValue;

public abstract class AttributeValueBase<T> implements AttributeValue<T> {
    private DynamicAttributeKey dynamicAttributeKey;

    public DynamicAttributeKey getAttribute() {
        return dynamicAttributeKey;
    }

    public void setDynamicAttributeKey(DynamicAttributeKey dynamicAttributeKey) {
        this.dynamicAttributeKey = dynamicAttributeKey;
    }
}
