package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.Attribute;
import com.glqdlt.myho.api.attribute.AttributeValue;
import com.glqdlt.myho.api.attribute.AttributeFormTypeStreo;
import com.glqdlt.myho.api.attribute.stereo.value.TextAttributeValue;

public class ArticleBoardAttribute implements Attribute<String>, Entity<Integer> {
    private Integer identity;

    private TextAttributeValue textAttributeValue = new TextAttributeValue();

    public ArticleBoardAttribute(Integer identity) {
        this.identity = identity;
    }

    public TextAttributeValue getTextAttributeValue() {
        return textAttributeValue;
    }

    public void setTextAttributeValue(TextAttributeValue textAttributeValue) {
        this.textAttributeValue = textAttributeValue;
    }

    @Override
    public AttributeValue<String> getAttributeValue() {
        return getTextAttributeValue();
    }

    @Override
    public String attributeDisplayText() {
        return "본문";
    }

    @Override
    public Integer getOrder() {
        return 0;
    }

    @Override
    public Boolean isFixedOrder() {
        return true;
    }

    @Override
    public String getKeyValue() {
        return getIdentity().toString();
    }

    @Override
    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @Override
    public Integer getFormTypeNumber() {
        return AttributeFormTypeStreo.WYSIWIG.getFormTypeNumber();
    }
}
