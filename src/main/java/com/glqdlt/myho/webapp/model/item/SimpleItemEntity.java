package com.glqdlt.myho.webapp.model.item;

import javax.persistence.Transient;

public class SimpleItemEntity extends AbstractItemEntity {
    @Transient
    @Override
    public String getItemTypeName() {
        return "i";
    }
}
