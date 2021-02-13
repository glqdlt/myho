package com.glqdlt.myho.webapp.site.item;


import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.webapp.site.attribute.AbstractAttributeKeyEntity;
import com.glqdlt.myho.webapp.site.tag.TagAbstractEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author glqdlt
 */
@javax.persistence.Entity
@Table(name = "tb_item_template")
public class ItemTamplateEntity implements Entity<Integer> {
    private Integer identity;
    private String name;
    private List<TagAbstractEntity> tag = new ArrayList<>();
    private List<AbstractAttributeKeyEntity> key = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "tb_item_template_key")
    public List<AbstractAttributeKeyEntity> getKey() {
        return key;
    }

    public void setKey(List<AbstractAttributeKeyEntity> key) {
        this.key = key;
    }

    @OneToMany
    @JoinTable(name = "tb_item_template_tag")
    public List<TagAbstractEntity> getTag() {
        return tag;
    }

    public void setTag(List<TagAbstractEntity> tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Integer getIdentity() {
        return identity;
    }
}
