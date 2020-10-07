package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;
import com.glqdlt.myho.api.Tag;
import com.glqdlt.myho.api.attribute.Attribute;

public interface Article<T extends Tag, A extends Attribute<?>> extends Item<T, A> {

    String getWriter();

    String getTitle();

}
