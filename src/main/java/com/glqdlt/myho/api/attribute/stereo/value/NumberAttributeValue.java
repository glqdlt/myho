package com.glqdlt.myho.api.attribute.stereo.value;

import com.glqdlt.myho.api.attribute.AttributeValue;

public class NumberAttributeValue implements AttributeValue<Long> {

    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public Long getValue() {
        return getNumber();
    }
}
