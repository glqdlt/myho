package com.glqdlt.myho.api.attribute.stereo;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.AttirubteType;
import com.glqdlt.myho.api.attribute.AttributeKey;

/**
 * TODO 어트리뷰트 키하고 벨류를 분리를 해야한다.
 * 벨류가 키를 참조하는 식으로 해야할듯
 */
public class DynamicAttributeKey implements Entity<Long>, AttributeKey {
    private Long identity;
    private String label;
    private AttirubteType attirubteType;

    public String getName() {
        return label;
    }

    @Override
    public AttirubteType getAttributeType() {
        return attirubteType;
    }

    public void setAttirubteType(AttirubteType attirubteType) {
        this.attirubteType = attirubteType;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }
}
