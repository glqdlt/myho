package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public abstract class ItemEntity implements Entity<Long> {
    private Long identity;
    private String name;
    private List<AbstractAttributeEntity<?>> attributes = new LinkedList<>();
    private LocalDateTime regDate = LocalDateTime.now();
    private List<TagEntity> tag;


    public List<TagEntity> getTag() {
        return tag;
    }

    public void setTag(List<TagEntity> tag) {
        this.tag = tag;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public List<AbstractAttributeEntity<?>> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AbstractAttributeEntity<?>> attributes) {
        this.attributes = attributes;
    }

}
