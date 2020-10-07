package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Item;

import javax.persistence.*;

@Table
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "item_type", discriminatorType = DiscriminatorType.CHAR)
public abstract class AbstractItemEntity extends Item<TagEntity, AttributeEntity<?>> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    @Override
    public Long getIdentity() {
        return super.getIdentity();
    }
}
