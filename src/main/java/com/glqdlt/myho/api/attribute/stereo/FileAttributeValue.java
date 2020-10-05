package com.glqdlt.myho.api.attribute.stereo;

public class FileAttributeValue extends AttributeValueBase<String> {
    private String uplodePath;

    public String getUplodePath() {
        return uplodePath;
    }

    public void setUplodePath(String uplodePath) {
        this.uplodePath = uplodePath;
    }

    @Override
    public Integer getAttributeFormType() {
        return AttribueTypeStereoes.FILE.getType();
    }

    @Override
    public String getValue() {
        return getUplodePath();
    }

}
