package com.glqdlt.myho.webapp.model.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("a")
public class ArticleEntity extends ItemEntity implements Article<TagAbstractEntity, AttributeEntity<?>> {

    private String writer;
    private String title;

    @Override
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
