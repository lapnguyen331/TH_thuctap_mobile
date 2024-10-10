package com.example.th2;

import java.io.Serializable;

public class Student implements Serializable {
    private int idSource;
    private String name;

    public Student(int idSource, String name) {
        this.idSource = idSource;
        this.name = name;
    }

    public int getIdSource() {
        return idSource;
    }

    public void setIdSource(int idSource) {
        this.idSource = idSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
