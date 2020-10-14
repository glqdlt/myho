package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.attribute.AttributeValue;

public class NumberAttributeEntity extends AbstractAttributeEntity<Long> {
    private Long value;
    private AttributeValue<Long> attributeValue;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
        this.attributeValue = () -> value;
    }

    @Override
    public AttributeValue<Long> getAttributeValue() {
        return attributeValue;
    }
}
