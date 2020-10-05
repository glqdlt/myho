package com.glqdlt.myho.api.attribute.stereo;

import java.time.LocalDateTime;

public class TimeAttributeValue extends AttributeValueBase<LocalDateTime> {
    private LocalDateTime value;

    public void setValue(LocalDateTime value) {
        this.value = value;
    }

    @Override
    public Integer getAttributeFormType() {
        return AttribueTypeStereoes.TIME.getType();
    }

    @Override
    public LocalDateTime getValue() {
        return value;
    }
}
