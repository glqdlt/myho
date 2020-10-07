package com.glqdlt.myho.api.attribute.stereo.value;

import com.glqdlt.myho.api.attribute.AttributeValue;

import java.time.LocalDateTime;

public class TimeAttributeValue implements AttributeValue<LocalDateTime> {
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public LocalDateTime getValue() {
        return getTime();
    }


}
