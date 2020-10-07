package com.glqdlt.myho.api.attribute.stereo.value;

import com.glqdlt.myho.api.RangeTime;
import com.glqdlt.myho.api.attribute.AttributeValue;

public class RangeTimeAttributeValue implements AttributeValue<RangeTime> {
    private RangeTime value;

    @Override
    public RangeTime getValue() {
        return value;
    }

    public void setValue(RangeTime value) {
        this.value = value;
    }
}
