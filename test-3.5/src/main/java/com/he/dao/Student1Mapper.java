package com.he.dao;

import com.he.pojo.Student1;

import java.lang.reflect.Array;
import java.util.List;

public interface Student1Mapper {
    List<Student1>getStudentInformation();
    List<Student1> getStudent1InformationByName(String name);
    List<Student1> getStudent1InformationByProfession(Student1 student);
    List<Student1> queryStudentInformationByNumber(Student1 student);
    List<Student1> queryStudent1InformationByid(int[] id);
}
