package com.glqdlt.myho.webapp.model.item;

import com.glqdlt.myho.api.Tag;
import com.glqdlt.myho.webapp.api.LongEntity;
import com.glqdlt.myho.webapp.model.category.Category;

import javax.persistence.*;

@Table
@Entity
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class TagAbstractEntity implements Tag, LongEntity {
    private Long identity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getIdentity() {
        return identity;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    @Entity
    @DiscriminatorValue("t")
    public static class SimpleTagEntity extends TagAbstractEntity {

    }

    @Entity
    @DiscriminatorValue("c")
    public static class CategoryEntity extends TagAbstractEntity implements Category {

        @Transient
        @Override
        public String getCategoryName() {
            return getName();
        }
    }
}
