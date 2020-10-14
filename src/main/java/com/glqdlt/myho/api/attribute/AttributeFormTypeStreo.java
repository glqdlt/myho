package com.glqdlt.myho.api.attribute;

public enum AttributeFormTypeStreo implements AttributeFormType {
    WYSIWIG,
    TEXT,
    NUMBER;

    @Override
    public Integer getFormTypeNumber() {
        return ordinal();
    }
}
