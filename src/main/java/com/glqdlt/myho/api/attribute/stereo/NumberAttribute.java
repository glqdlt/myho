package com.glqdlt.myho.api.attribute.stereo;

public class NumberAttribute extends AttributeBase<Long> {
    private Long value;

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeType() {
        return 2;
    }

    @Override
    public Long getValue() {
        return value;
    }
}
