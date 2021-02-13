package com.glqdlt.myho.api.attribute;

import com.glqdlt.myho.api.attribute.key.AttributeKey;
import com.glqdlt.myho.api.attribute.value.AttributeValue;

/**
 * @author glqdlt
 */
public interface Attribute<VALUE> {

    AttributeValue<VALUE> getAttributeValue();

    AttributeKey<VALUE> getAttributeKey();
    
    default Integer getOrder() {
        return 10;
    }

}
