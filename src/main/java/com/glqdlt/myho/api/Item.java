package com.glqdlt.myho.api;

import java.time.LocalDateTime;
import java.util.List;

public class Item implements Entity {
    private Integer identity;
    private String title;
    private String writer;
    private LocalDateTime writeDate = LocalDateTime.now();
    private ItemTemplate itemTemplate;
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

    public ItemTemplate getItemTemplate() {
        return itemTemplate;
    }

    public void setItemTemplate(ItemTemplate itemTemplate) {
        this.itemTemplate = itemTemplate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @Override
    public String getEntityName() {
        return getTitle();
    }

    @Override
    public LocalDateTime getCreateTime() {
        return writeDate;
    }
}
