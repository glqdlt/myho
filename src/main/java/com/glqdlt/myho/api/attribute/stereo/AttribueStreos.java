package com.glqdlt.myho.api.attribute.stereo;

public enum AttribueStreos {
    TEXT(1),
    NUMBER(2),
    TIME(3),
    RANGE_TIME(4),
    FILE(5);

    AttribueStreos(Integer type) {
        this.type = type;
    }

    private final Integer type;

    public Integer getType() {
        return type;
    }
}
