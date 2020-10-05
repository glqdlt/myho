package com.glqdlt.myho.api.article;

import com.glqdlt.myho.api.Item;

public class Article extends Item {
    private ArticleBody articleBody;

    public ArticleBody getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(ArticleBody articleBody) {
        this.articleBody = articleBody;
    }
}
