package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;

public class MetaDataEntity implements Entity<Long> {
    private String name;
    private Long identity;

    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
