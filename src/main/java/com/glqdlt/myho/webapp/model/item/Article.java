package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;

import java.util.Collections;

public class Article extends Item {

    private String title;
    private String writer;

    public Article() {
        setAttributes(Collections.singletonList(new ArticleBoardAttribute(0)));
    }

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
