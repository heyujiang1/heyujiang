package com.he.pojo;

public class Student1 {
    private int id;
    private int age;
    private String name;
    private int number;
    private  String profession;

    public Student1() {
    }

    public Student1(int id, int age, String name, int number, String profession) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.number = number;
        this.profession = profession;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", profession='" + profession + '\'' +
                '}';
    }
}
