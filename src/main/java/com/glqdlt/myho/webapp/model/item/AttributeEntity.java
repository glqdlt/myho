package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.Attribute;

public abstract class AttributeEntity<T> implements Attribute<T>, Entity<Long> {
    private Long identity;
    private String attributeDisplayText;

    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Override
    public String attributeDisplayText() {
        return attributeDisplayText;
    }

    public void setAttributeDisplayText(String attributeDisplayText) {
        this.attributeDisplayText = attributeDisplayText;
    }
}
