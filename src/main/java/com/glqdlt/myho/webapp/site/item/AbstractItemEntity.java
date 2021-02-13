package com.glqdlt.myho.webapp.site.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.Item;
import com.glqdlt.myho.webapp.site.attribute.AttributeEntity;
import com.glqdlt.myho.webapp.site.tag.TagAbstractEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author glqdlt
 */
@javax.persistence.Entity
@Table(name = "tb_item")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class AbstractItemEntity implements Entity<Long>, Item<AttributeEntity, TagAbstractEntity> {

    private Long identity;
    private String name;
    private LocalDateTime regDate;
    private String writer;
    private List<AttributeEntity> attributes = new ArrayList<>();
    private List<TagAbstractEntity> tag = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setAttributes(List<AttributeEntity> attributes) {
        this.attributes = attributes;
    }

    public void setTag(List<TagAbstractEntity> tag) {
        this.tag = tag;
    }

    @OneToMany
    @JoinTable(name="tb_item_att")
    @Override
    public List<AttributeEntity> getAttributes() {
        return attributes;
    }


    @OneToMany
    @JoinTable(name="tb_item_tag")
    @Override
    public List<TagAbstractEntity> getTag() {
        return tag;
    }

    @javax.persistence.Entity
    @DiscriminatorValue("d")
    public static class SimpleItem extends AbstractItemEntity {

    }
}
