package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.attribute.AttributeValue;

public class TextAttributeEntity extends AbstractAttributeEntity<String> {
    private String value;
    private AttributeValue<String> stringAttributeValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.stringAttributeValue = () -> value;
    }

    @Override
    public AttributeValue<String> getAttributeValue() {
        return stringAttributeValue;
    }
}
