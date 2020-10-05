package com.glqdlt.myho.api.attribute;

public interface Attribute {
    AttributeKey getAttribute();
    AttributeValue getAttributeValue();
    default Integer getOrder(){
        return 0;
    };
}
