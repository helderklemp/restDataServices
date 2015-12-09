package com.klemp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by helderklemp on 9/12/2015.
 */
@Entity
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String descrptyion;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrptyion() {
        return descrptyion;
    }

    public void setDescrptyion(String descrptyion) {
        this.descrptyion = descrptyion;
    }
}
