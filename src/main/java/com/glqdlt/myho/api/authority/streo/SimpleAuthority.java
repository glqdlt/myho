package com.glqdlt.myho.api.authority.streo;

import com.glqdlt.myho.api.authority.Authority;

public class SimpleAuthority implements Authority {
    private String authroity;

    public String getAuthroity() {
        return authroity;
    }

    public void setAuthroity(String authroity) {
        this.authroity = authroity;
    }
    @Override
    public Integer getType() {
        return 1;
    }

    @Override
    public Boolean match(String authority) {
        return authority.equals(getAuthroity());
    }
}
