package com.glqdlt.myho.webapp.site.attribute;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.Attribute;

import javax.persistence.*;

/**
 * @author glqdlt
 */
@javax.persistence.Entity
@Table(name = "tb_attribute")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class AttributeEntity<V> implements Attribute<V>, Entity<Long> {
    private Long identity;

    @Transient
    @Override
    public abstract AbstractAttributeValueEntity<V> getAttributeValue();

    @Transient
    @Override
    public abstract AbstractAttributeKeyEntity<V> getAttributeKey();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @javax.persistence.Entity
    @DiscriminatorValue("1")
    public static class StringAttributeEntity extends AttributeEntity<String> {

        private AbstractAttributeKeyEntity.StringKey attributeKey;

        private AbstractAttributeValueEntity.StringValue attributeValue;


        @OneToOne
        @JoinColumn(name = "attr_key")
        @Override
        public AbstractAttributeKeyEntity.StringKey getAttributeKey() {
            return attributeKey;
        }

        public void setAttributeKey(AbstractAttributeKeyEntity.StringKey attributeKey) {
            this.attributeKey = attributeKey;
        }

        @OneToOne
        @JoinColumn(name = "attr_value")
        @Override
        public AbstractAttributeValueEntity.StringValue getAttributeValue() {
            return attributeValue;
        }

        public void setAttributeValue(AbstractAttributeValueEntity.StringValue attributeValue) {
            this.attributeValue = attributeValue;
        }
    }
}
