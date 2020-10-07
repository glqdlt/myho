package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.attribute.Attribute;
import com.glqdlt.myho.api.attribute.AttributeFormType;
import com.glqdlt.myho.api.attribute.AttributeValue;
import com.glqdlt.myho.api.attribute.stereo.form.WysiwygFormType;
import com.glqdlt.myho.api.attribute.stereo.value.TextAttributeValue;

public class ArticleBoardAttribute implements Attribute<String> {
    private WysiwygFormType wysiwygFormType;
    private TextAttributeValue textAttributeValue;

    public TextAttributeValue getTextAttributeValue() {
        return textAttributeValue;
    }

    public void setTextAttributeValue(TextAttributeValue textAttributeValue) {
        this.textAttributeValue = textAttributeValue;
    }

    public WysiwygFormType getWysiwygFormType() {
        return wysiwygFormType;
    }

    public void setWysiwygFormType(WysiwygFormType wysiwygFormType) {
        this.wysiwygFormType = wysiwygFormType;
    }

    @Override
    public AttributeFormType<String> getAttributeFormType() {
        return getWysiwygFormType();
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
}
