package com.glqdlt.myho.webapp.model.item;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class ArticleEntity extends Article<TagEntity, AttributeEntity<?>> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    @Override
    public Long getIdentity() {
        return super.getIdentity();
    }

    @Override
    public String getWriter() {
        return super.getWriter();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Transient
    @Override
    public String getName() {
        return super.getName();
    }

    @Transient
    @Override
    public String getItemTypeName() {
        return super.getItemTypeName();
    }

    @Override
    public List<TagEntity> getTag() {
        return super.getTag();
    }

    @Override
    public LocalDateTime getWriteDate() {
        return super.getWriteDate();
    }

    @Override
    public List<AttributeEntity<?>> getAttributes() {
        return super.getAttributes();
    }
}
