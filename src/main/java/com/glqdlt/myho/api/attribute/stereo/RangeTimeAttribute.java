package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.attribute.RangeTime;

public class RangeTimeAttribute extends AttributeBase<RangeTime>{
    private RangeTime value;

    public void setValue(RangeTime value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeType() {
        return 4;
    }

    @Override
    public RangeTime getValue() {
        return value;
    }
}
