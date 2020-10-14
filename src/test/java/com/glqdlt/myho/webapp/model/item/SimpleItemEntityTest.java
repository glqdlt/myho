package com.glqdlt.myho.webapp.model.item;

import org.junit.jupiter.api.Test;

class SimpleItemEntityTest {

    @Test
    void name() {
        SimpleItemEntity simpleItemEntity = new SimpleItemEntity();
        simpleItemEntity.setIdentity(1L);
        simpleItemEntity.setName("클린코더");
    }
}