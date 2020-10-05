package com.glqdlt.myho.api.attribute.stereo;

import java.time.LocalDateTime;

public class TimeAttribute extends AttributeBase<LocalDateTime> {
    private LocalDateTime value;

    public void setValue(LocalDateTime value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeType() {
        return 3;
    }

    @Override
    public LocalDateTime getValue() {
        return value;
    }
}
