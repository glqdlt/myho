package com.glqdlt.myho.api;

import com.glqdlt.myho.api.attribute.Attribute;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public abstract class Item<T extends Tag, A extends Attribute<?>> implements Entity<Long> {
    public abstract String getItemTypeName();

    private Long identity;
    private String name;
    private List<A> attributes = new LinkedList<>();
    private LocalDateTime writeDate = LocalDateTime.now();
    private List<T> tag;

    public List<T> getTag() {
        return tag;
    }

    public void setTag(List<T> tag) {
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

    public List<A> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<A> attributes) {
        this.attributes = attributes;
    }

}
