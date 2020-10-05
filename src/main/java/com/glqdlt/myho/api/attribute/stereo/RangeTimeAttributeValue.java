package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.RangeTime;

public class RangeTimeAttributeValue extends AttributeValueBase<RangeTime> {
    private RangeTime value;

    public void setValue(RangeTime value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeFormType() {
        return AttribueTypeStereoes.RANGE_TIME.getType();
    }

    @Override
    public RangeTime getValue() {
        return value;
    }

    @Override
    public Boolean valid(RangeTime rangeTime) {
        return rangeTime.valid();
    }
}
