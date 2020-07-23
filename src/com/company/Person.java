package com.company;

public class Person {
    /*
     * Person class would be used in all DS to
     * describe how these various structures store
     * and managed their data.
     */
    String name;
    int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
