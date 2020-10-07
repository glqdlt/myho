package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "item_type", discriminatorType = DiscriminatorType.CHAR)
public abstract class ItemEntity implements Item<TagAbstractEntity, AttributeEntity<?>> {
    private Long identity;
    private List<TagAbstractEntity> tag;
    private LocalDateTime writeDate;
    private String name;
    private List<AttributeEntity<?>> attributes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @OneToMany
    @Override
    public List<TagAbstractEntity> getTag() {
        return tag;
    }

    public void setTag(List<TagAbstractEntity> tag) {
        this.tag = tag;
    }

    @Override
    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    @Override
    public List<AttributeEntity<?>> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeEntity<?>> attributes) {
        this.attributes = attributes;
    }
}
