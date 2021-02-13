package com.glqdlt.myho.api.attribute.key;


/**
 * @author glqdlt
 */
public interface AttributeKey<TYPE> {
    String getName();

    Class<TYPE> getType();

}
