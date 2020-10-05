package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.attribute.Attribute;

public abstract class AttributeBase<T> implements Attribute<T> {
    private String name;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
