package com.he.dao;

import com.he.pojo.Student1;
import com.he.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testgetStudentInformation(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student1Mapper mapper=session.getMapper(Student1Mapper.class);
            List<Student1> student=mapper.getStudentInformation();
            for (Student1 student1 : student) {
                System.out.println(student1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testGetStudent1InformationByName(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student1Mapper mapper=session.getMapper(Student1Mapper.class);
            String name="贺六";
            List<Student1> student=mapper.getStudent1InformationByName(name);
            for (Student1 student1 : student) {
                System.out.println(student1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testGetStudent1InformationByProfession(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student1Mapper mapper=session.getMapper(Student1Mapper.class);
           Student1 student=new Student1();
           student.setProfession("计算机");
            List<Student1> student1=mapper.getStudent1InformationByProfession(student);
            for (Student1 student2 : student1) {
                System.out.println(student2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testQueryStudentInformationByNumber(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student1Mapper mapper=session.getMapper(Student1Mapper.class);
            Student1 student=new Student1();
            List<Student1> student1=mapper.queryStudentInformationByNumber(student);
            for (Student1 student2 : student1) {
                System.out.println(student2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testQueryStudent1InformationByid(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student1Mapper mapper=session.getMapper(Student1Mapper.class);
          int[] ids={1,2,3,4,5};
            List<Student1> student1=mapper.queryStudent1InformationByid(ids);
            for (Student1 student2 : student1) {
                System.out.println(student2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
