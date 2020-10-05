package com.glqdlt.myho.api.attribute.stereo;

public class NumberAttributeValue extends AttributeValueBase<Long> {
    private Long value;

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeFormType() {
        return AttribueTypeStereoes.NUMBER.getType();
    }

    @Override
    public Long getValue() {
        return value;
    }

}
