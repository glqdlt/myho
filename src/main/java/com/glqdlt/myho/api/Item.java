package com.glqdlt.myho.api;

import com.glqdlt.myho.api.attribute.Attribute;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public abstract class Item implements Entity<Long> {
    public abstract String getItemTypeName();

    private Long identity;
    private String name;
    private List<Attribute<?>> attributes = new LinkedList<>();
    private LocalDateTime writeDate = LocalDateTime.now();
    private List<Tag> tag;

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
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

    public List<Attribute<?>> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute<?>> attributes) {
        this.attributes = attributes;
    }
}
