package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.attribute.AttributeValue;

public class FileAttatchmentUrlAttributeEntity extends AbstractAttributeEntity<String> {

    private String value;
    private AttributeValue<String> attributeValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.attributeValue = () -> value;
    }

    @Override
    public AttributeValue<String> getAttributeValue() {
        return attributeValue;
    }
}
