package com.glqdlt.myho.api.authority;

public interface Authority {
    String getAuthroity();
    Integer getType();
    Boolean match(String authority);
}
