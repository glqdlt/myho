package com.glqdlt.myho.api.attribute;

public interface Attribute<V> extends AttributeIdentityKey {
    AttributeFormType<V> getAttributeFormType();

    AttributeValue<V> getAttributeValue();

    String attributeDisplayText();

    String getDrawSource();

    /**
     * 에센딩(asc) 우선 순위 정렬.
     * 0~9 까지는 기본 스테레오에서 사용함.
     * 10 이상은 자유
     *
     * @return
     */
    default Integer getOrder() {
        return 10;
    }

    default Boolean isFixedOrder() {
        return false;
    }
}
