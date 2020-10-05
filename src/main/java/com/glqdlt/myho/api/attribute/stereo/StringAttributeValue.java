package com.glqdlt.myho.api.attribute.stereo;

public class StringAttributeValue extends AttributeValueBase<String> {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeFormType() {
        return AttribueTypeStereoes.TEXT.getType();
    }

    @Override
    public String getValue() {
        return value;
    }
}
