package com.UserApp.UserApp1;

public class User {
    private long id;
    private String name;
    private String surname;


    public User(long id,String name,String surname)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
    }
    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
