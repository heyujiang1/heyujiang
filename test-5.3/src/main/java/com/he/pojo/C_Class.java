package com.he.pojo;

import java.util.List;

public class C_Class {
    private int id;
    private String classname;
    private List<S_Student> s_student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<S_Student> getS_student() {
        return s_student;
    }

    public void setS_student(List<S_Student> s_student) {
        this.s_student = s_student;
    }

    @Override
    public String toString() {
        return "C_Class{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", s_student=" + s_student +
                '}';
    }
}
