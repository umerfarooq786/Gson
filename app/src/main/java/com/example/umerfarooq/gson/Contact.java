package com.example.umerfarooq.gson;

/**
 * Created by Umer Farooq on 12/28/2017.
 */

public class Contact {
    private int id;
    private String name;
    private boolean gender;

    public Contact(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
