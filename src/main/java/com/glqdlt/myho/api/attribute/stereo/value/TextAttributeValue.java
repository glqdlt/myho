package com.glqdlt.myho.api.attribute.stereo.value;

public class TextAttributeValue implements StringAttributeValue {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getValue() {
        return getText();
    }
}
