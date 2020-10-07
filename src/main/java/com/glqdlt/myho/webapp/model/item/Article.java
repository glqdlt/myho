package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;

public class Article extends Item {

    private String title;
    private String writer;

    public Article() {
        getAttributes().add(new ArticleBoardAttribute());
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
    public String getItemTypeName() {
        return "Article";
    }
}
