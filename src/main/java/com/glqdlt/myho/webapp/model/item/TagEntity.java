package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Tag;
import com.glqdlt.myho.webapp.api.LongEntity;

import javax.persistence.Id;

public class TagEntity implements Tag, LongEntity {
    private Long identity;
    private String name;

    @Id
    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
