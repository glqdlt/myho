package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.Tag;

public abstract class TagEntity implements Tag, Entity<Long> {
    private Long identity;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Override
    public Long getIdentity() {
        return identity;
    }

    @Override
    public String getName() {
        return name;
    }
}
