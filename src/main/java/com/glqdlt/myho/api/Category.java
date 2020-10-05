package com.glqdlt.myho.api;

public class Category implements Tag{
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public Integer getTagType() {
        return 2;
    }

    @Override
    public String getName() {
        return getCategoryName();
    }
}
