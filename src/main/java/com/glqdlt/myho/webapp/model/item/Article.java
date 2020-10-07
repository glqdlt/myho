package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;
import com.glqdlt.myho.api.Tag;
import com.glqdlt.myho.api.attribute.Attribute;

public abstract class Article<T extends Tag, A extends Attribute<?>> extends Item<T, A> {

    private String title;
    private String writer;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return getTitle();
    }

    @Override
    public void setName(String name) {
        setTitle(name);
    }

    @Override
    public String getItemTypeName() {
        return "Article";
    }
}
