package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.Attribute;

public abstract class AbstractAttributeEntity<T> implements Entity<Long>, Attribute<T> {
    private Long id;
    private AttributeTemplateEntity attributeTemplateEntity;

    public AttributeTemplateEntity getAttributeTemplateEntity() {
        return attributeTemplateEntity;
    }

    public void setAttributeTemplateEntity(AttributeTemplateEntity attributeTemplateEntity) {
        this.attributeTemplateEntity = attributeTemplateEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getIdentity() {
        return getId();
    }

    @Override
    public String attributeDisplayText() {
        return getAttributeTemplateEntity().getDisplayName();
    }

    @Override
    public Integer getFormTypeNumber() {
        return getAttributeTemplateEntity().getFormTypeNumber();
    }
}
