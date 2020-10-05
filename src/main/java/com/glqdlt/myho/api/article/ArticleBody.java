package com.glqdlt.myho.api.article;

import com.glqdlt.myho.api.attribute.Attribute;

public class ArticleBody implements Attribute<String> {
    @Override
    public String getName() {
        return "본문";
    }

    private String contents;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public Integer getAttributeType() {
        return 1;
    }

    @Override
    public String getValue() {
        return getContents();
    }
}
