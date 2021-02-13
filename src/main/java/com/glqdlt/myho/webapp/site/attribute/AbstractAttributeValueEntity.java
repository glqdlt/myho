package com.glqdlt.myho.webapp.site.attribute;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.value.AttributeValue;

import javax.persistence.*;

/**
 * @author glqdlt
 */
@javax.persistence.Entity
@Table(name = "tb_attribute_value")
@Inheritance()
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class AbstractAttributeValueEntity<V> implements AttributeValue<V>, Entity<Long> {

    private Long identity;

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
    public static class StringValue extends AbstractAttributeValueEntity<String> {

        private String stringValue;

        @Transient
        @Override
        public String getValue() {
            return stringValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String value) {
            this.stringValue = value;
        }
    }
}
