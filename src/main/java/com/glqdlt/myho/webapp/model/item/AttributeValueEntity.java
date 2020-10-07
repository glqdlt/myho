package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.AttributeValue;

import javax.persistence.*;

@javax.persistence.Entity
@Table
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AttributeValueEntity<T> implements AttributeValue<T>, Entity<Long>, AttributeConverter<AttributeValue<T>, T> {
    private Long identity;
    private String attributeDisplayText;

    public String getAttributeDisplayText() {
        return attributeDisplayText;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public void setAttributeDisplayText(String attributeDisplayText) {
        this.attributeDisplayText = attributeDisplayText;
    }

    @Override
    public T convertToDatabaseColumn(AttributeValue<T> attribute) {
        return attribute.getValue();
    }
}
