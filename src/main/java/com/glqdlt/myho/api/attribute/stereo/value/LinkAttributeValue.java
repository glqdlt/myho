package com.glqdlt.myho.api.attribute.stereo.value;

public class LinkAttributeValue implements StringAttributeValue {

    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String getValue() {
        return getLink();
    }
}
