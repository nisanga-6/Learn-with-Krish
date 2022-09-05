package com.Example.Prototype;

public class Employee implements Cloneable {

    private int id;
    private String name;

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

    protected Object clone() throws CloneNotSupportedException{


        return super.clone();
    }
}
