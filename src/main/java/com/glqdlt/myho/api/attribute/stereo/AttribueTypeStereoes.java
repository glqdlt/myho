package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.attribute.AttirubteType;

public enum AttribueTypeStereoes implements AttirubteType {
    TEXT,
    NUMBER,
    TIME,
    RANGE_TIME,
    FILE,
    LINK,
    WYSIWIG;

    @Override
    public String getName() {
        return name();
    }

    public Integer getType() {
        return ordinal();
    }
}
