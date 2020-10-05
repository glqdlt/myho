package com.glqdlt.myho.api.attribute.stereo;

public class FileAttribute extends AttributeBase<String> {
    private String uplodePath;

    public String getUplodePath() {
        return uplodePath;
    }

    public void setUplodePath(String uplodePath) {
        this.uplodePath = uplodePath;
    }

    @Override
    public Integer getAttributeType() {
        return 5;
    }

    @Override
    public String getValue() {
        return getUplodePath();
    }

}
