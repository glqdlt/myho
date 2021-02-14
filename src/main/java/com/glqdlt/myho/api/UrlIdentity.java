package com.glqdlt.myho.api;

public interface UrlIdentity {
    String getMethod();

    String getPath();

    default String getIdentity() {
        return String.format("{%s %s}", getMethod(), getPath());
    }
}
