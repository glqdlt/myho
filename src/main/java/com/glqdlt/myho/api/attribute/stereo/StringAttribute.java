package com.glqdlt.myho.api.attribute.stereo;

public class StringAttribute extends AttributeBase<String>{

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeType() {
        return 1;
    }

    @Override
    public String getValue() {
        return value;
    }
}
