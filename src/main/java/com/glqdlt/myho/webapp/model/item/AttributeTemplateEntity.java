package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.AttributeFormType;

public class AttributeTemplateEntity implements Entity<Integer>, AttributeFormType {
    private Integer id;
    private String displayName;
    private Integer attributeFormTypeNumber;

    public Integer getAttributeFormTypeNumber() {
        return attributeFormTypeNumber;
    }

    public void setAttributeFormTypeNumber(Integer attributeFormTypeNumber) {
        this.attributeFormTypeNumber = attributeFormTypeNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getIdentity() {
        return getId();
    }

    @Override
    public Integer getFormTypeNumber() {
        return getAttributeFormTypeNumber();
    }
}
