package com.devsenior.cdiaz.pet.model.entity;

import com.devsenior.cdiaz.pet.model.entity.Dog.DogId;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "dogs")
@IdClass(DogId.class)
public class Dog {

    @Id
    private Long idOwner;

    @Id
    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String type;

    private Integer age;

    @Column(length = 50, nullable = false)
    private String color;

    public Long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Long idOwner) {
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class DogId implements Serializable {
        private Long idOwner;
        private String name;

        public Long getIdOwner() {
            return idOwner;
        }

        public void setIdOwner(Long idOwner) {
            this.idOwner = idOwner;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idOwner == null) ? 0 : idOwner.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            DogId other = (DogId) obj;
            if (idOwner == null) {
                if (other.idOwner != null)
                    return false;
            } else if (!idOwner.equals(other.idOwner))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        
    }

}
