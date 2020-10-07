package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.attribute.AttributeValue;
import com.glqdlt.myho.api.attribute.stereo.value.TextAttributeValue;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class StringValueEntity extends AttributeValueEntity<String> {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Transient
    @Override
    public String getValue() {
        return getText();
    }

    @Override
    public AttributeValue<String> convertToEntityAttribute(String dbData) {
        TextAttributeValue textAttributeValue = new TextAttributeValue();
        textAttributeValue.setText(dbData);
        return textAttributeValue;
    }
}
