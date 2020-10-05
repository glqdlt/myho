package com.glqdlt.myho.api.authority.streo;

import com.glqdlt.myho.api.authority.Authority;

public class RoleAuthority implements Authority {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthroity() {
        return getRole();
    }

    @Override
    public Integer getType() {
        return 2;
    }

    @Override
    public Boolean match(String authority) {
        if(!authority.startsWith("ROLE_")){
            authority = "ROLE_"+authority;
        }
        return getRole().equals(authority);
    }
}
