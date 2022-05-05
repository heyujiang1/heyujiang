package com.he.pojo;

public class S_Student {
    private int id;
    private String name;
    private  int age;
    private C_Class c_class;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public C_Class getC_class() {
        return c_class;
    }

    public void setC_class(C_Class c_class) {
        this.c_class = c_class;
    }

    @Override
    public String toString() {
        return "S_Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", c_class=" + c_class +
                '}';
    }
}
