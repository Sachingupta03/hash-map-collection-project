package com.collection.model;

public class Person {
    private int Id;
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name,int age ,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setId (int id) {
        Id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    @Override
    public String toString () {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
