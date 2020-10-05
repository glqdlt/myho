package com.glqdlt.myho.api.authority.streo;

import com.glqdlt.myho.api.authority.Authority;

public enum AuthorityStereo implements Authority {
    ANY(0){
        @Override
        public Boolean match(String authority) {
            return true;
        }
    };

    AuthorityStereo(Integer type) {
        this.type = type;
    }

    private final Integer type;

    @Override
    public String getAuthroity() {
        return this.name();
    }

    @Override
    public Integer getType() {
        return type;
    }
}
