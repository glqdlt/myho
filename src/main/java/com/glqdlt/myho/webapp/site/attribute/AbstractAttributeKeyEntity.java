package com.glqdlt.myho.webapp.site.attribute;

import com.glqdlt.myho.api.Entity;
import com.glqdlt.myho.api.attribute.key.AttributeKey;

import javax.persistence.*;

/**
 * @author glqdlt
 */
@javax.persistence.Entity
@Table(name = "tb_attribute_key")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class AbstractAttributeKeyEntity<T> implements AttributeKey<T>, Entity<Integer> {
    private Integer identity;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @javax.persistence.Entity
    @DiscriminatorValue("2")
    public static class NumberKey extends AbstractAttributeKeyEntity<Long> {

        @Transient
        @Override
        public Class<Long> getType() {
            return Long.class;
        }
    }

    @javax.persistence.Entity
    @DiscriminatorValue("1")
    public static class StringKey extends AbstractAttributeKeyEntity<String> {

        @Transient
        @Override
        public Class<String> getType() {
            return String.class;
        }
    }
}
