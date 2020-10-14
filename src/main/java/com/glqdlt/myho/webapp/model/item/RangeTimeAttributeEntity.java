package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.RangeTime;
import com.glqdlt.myho.api.attribute.AttributeValue;
import com.glqdlt.myho.api.attribute.stereo.value.RangeTimeAttributeValue;

import java.time.LocalDateTime;

public class RangeTimeAttributeEntity extends AbstractAttributeEntity<RangeTime> {
    private RangeTimeAttributeValue rangeTimeAttributeValue;
    private RangeTime rangeTime;
    private LocalDateTime from;
    private LocalDateTime to;

    public RangeTimeAttributeEntity() {
        this.rangeTime = new RangeTime();
        this.rangeTimeAttributeValue = new RangeTimeAttributeValue();
        this.rangeTimeAttributeValue.setValue(rangeTime);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
        this.rangeTime.setFrom(this.from);
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
        this.rangeTime.setTo(this.to);
    }

    @Override
    public AttributeValue<RangeTime> getAttributeValue() {
        return rangeTimeAttributeValue;
    }
}
