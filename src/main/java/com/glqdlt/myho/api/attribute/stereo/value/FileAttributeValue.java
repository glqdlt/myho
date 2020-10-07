package com.glqdlt.myho.api.attribute.stereo.value;

public class FileAttributeValue implements StringAttributeValue {
    private String uploadFilePath;

    public String getUploadFilePath() {
        return uploadFilePath;
    }

    public void setUploadFilePath(String uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    @Override
    public String getValue() {
        return getUploadFilePath();
    }

}
