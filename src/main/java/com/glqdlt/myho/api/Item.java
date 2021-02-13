package com.glqdlt.myho.api;

import com.glqdlt.myho.api.attribute.Attribute;

import java.time.LocalDateTime;
import java.util.List;

public interface Item<A extends Attribute, T extends Tag> {
    String getName();

    LocalDateTime getRegDate();

    List<A> getAttributes();

    List<T> getTag();
}
