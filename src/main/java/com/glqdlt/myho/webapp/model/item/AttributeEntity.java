package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.Attribute;
import com.glqdlt.myho.api.attribute.AttributeFormType;
import com.glqdlt.myho.api.attribute.AttributeValue;

import javax.persistence.*;

@javax.persistence.Entity
@Table
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AttributeEntity<T> implements Attribute<T>, Entity<Long>, AttributeConverter<AttributeFormType<?>, Integer> {
    private Long identity;
    private String attributeDisplayText;
    private Integer order;
    private AttributeValueEntity<T> attributeValueEntity;
    private AttributeFormType<T> attributeFormType;

    @OneToOne
    @JoinColumn(name = "value_id")
    public AttributeValueEntity<T> getAttributeValueEntity() {
        return attributeValueEntity;
    }

    public void setAttributeValueEntity(AttributeValueEntity<T> attributeValueEntity) {
        this.attributeValueEntity = attributeValueEntity;
    }

    @Transient
    @Override
    public AttributeValue<T> getAttributeValue() {
        return getAttributeValueEntity();
    }

    public void setAttributeFormType(AttributeFormType<T> attributeFormType) {
        this.attributeFormType = attributeFormType;
    }

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

    @Convert(converter = AttributeEntity.class)
    @Override
    public AttributeFormType<T> getAttributeFormType() {
        return this.attributeFormType;
    }


    @Override
    public String attributeDisplayText() {
        return attributeDisplayText;
    }

    public void setAttributeDisplayText(String attributeDisplayText) {
        this.attributeDisplayText = attributeDisplayText;
    }

    @Override
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public Integer convertToDatabaseColumn(AttributeFormType<?> attribute) {
        return null;
    }

    @Override
    public AttributeFormType<?> convertToEntityAttribute(Integer dbData) {
        return null;
    }
}
