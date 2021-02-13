package com.glqdlt.myho.webapp.site.tag;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.Tag;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "tb_tag")
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class TagAbstractEntity implements Tag, Entity<Long> {
    private Long identity;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getIdentity() {
        return identity;
    }

    @Override
    public String getName() {
        return name;
    }
}
