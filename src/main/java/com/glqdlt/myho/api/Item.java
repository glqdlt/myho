package com.glqdlt.myho.api;

import com.glqdlt.myho.api.attribute.Attribute;

import java.time.LocalDateTime;
import java.util.List;

public interface Item<T extends Tag, A extends Attribute<?>> extends Entity<Long> {
    List<T> getTag();

    LocalDateTime getWriteDate();

    String getName();

    Long getIdentity();

    List<A> getAttributes();


}
