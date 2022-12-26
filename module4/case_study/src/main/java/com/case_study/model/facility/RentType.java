package com.case_study.model.facility;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class RentType {
    @Id
    private int id;
    private String name;

    public RentType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
