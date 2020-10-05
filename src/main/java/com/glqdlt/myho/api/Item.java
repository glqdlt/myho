package com.glqdlt.myho.api;

import com.glqdlt.myho.api.attribute.Attribute;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Item implements Entity<Long> {
    private Long identity;
    private String name;
    private String writer;
    private List<Attribute> attributes = new LinkedList<>();
    private LocalDateTime writeDate = LocalDateTime.now();
    private List<Tag> tag;

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
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
}
