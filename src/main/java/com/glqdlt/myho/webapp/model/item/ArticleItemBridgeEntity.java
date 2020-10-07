package com.glqdlt.myho.webapp.model.item;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ArticleItemBridgeEntity extends AbstractItemEntity {
    private ArticleEntity articleEntity;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "article_seq", referencedColumnName = "seq")
    public ArticleEntity getArticleEntity() {
        return articleEntity;
    }

    public void setArticleEntity(ArticleEntity articleEntity) {
        this.articleEntity = articleEntity;
    }

    @Override
    public String getItemTypeName() {
        return "a";
    }
}
