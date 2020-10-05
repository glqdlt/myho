package com.glqdlt.myho.api;

import java.time.LocalDateTime;

public interface Entity {

    Integer getIdentity();

    String getEntityName();

    LocalDateTime getCreateTime();

}
