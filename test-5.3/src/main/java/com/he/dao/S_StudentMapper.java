package com.he.dao;

import com.he.pojo.S_Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface S_StudentMapper {
    @Select("select * from mybatis.s_student where id=#{id}")
    @Results({@Result(property = "c_class",column = "cid",
    one=@One(select="com.he.dao.C_ClassMapper.getClassInformation")
    )})
    S_Student getStudentInformation(int id);

//    @Select("select s.id sid,s.name sname,s.age sage,c.id cid,c.classname cclassname" +
//            "from mybatis.s_student s,mybatis.c_class c " +
//            "where s.cid=c.id and s.id=#{id}")
//    @Results(@Result(property = "c_class",column = "com.he.pojo.C-Class"))
//    S_Student getStudentInformation1(int id);

    @Update("update mybatis.s_student set name=#{name},age=#{age} where id=#{id}")
    int upDateStudentInformation(@Param("id") int id, @Param("name") String name, @Param("age") int age);

    @Select("select * from mybatis.s_student where cid=#{cid}")
    List<S_Student> getStudentInformationByClass(@Param("cid") int id);
}
