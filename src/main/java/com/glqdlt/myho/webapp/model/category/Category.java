package com.glqdlt.myho.webapp.model.category;

import com.glqdlt.myho.api.Tag;

public interface Category extends Tag {

    String getCategoryName();

    @Override
    default String getName() {
        return getCategoryName();
    }
}
