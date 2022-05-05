package com.he.pojo;

public class Employee {
    private  int id;
    private int age;
    private String name;
    private String position;

    public Employee() {
    }

    public Employee(int id, int age, String name, String position) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
