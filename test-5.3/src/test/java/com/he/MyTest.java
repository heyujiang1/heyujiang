package com.he;

import com.he.dao.C_ClassMapper;
import com.he.dao.S_StudentMapper;
import com.he.pojo.C_Class;
import com.he.pojo.S_Student;
import com.he.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testS_StudentMapper(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            S_StudentMapper studentmapper=session.getMapper(S_StudentMapper.class);
            S_Student student=studentmapper.getStudentInformation(2);
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
//    @Test
//    public void testS_StudentMapper1(){
//        SqlSession session= MybatisUtil.getSqlSession();
//        try{
//            S_StudentMapper studentmapper=session.getMapper(S_StudentMapper.class);
//            S_Student student=studentmapper.getStudentInformation1(2);
//            System.out.println(student);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//    }
    @Test
    public void testUpDateStudentInformation(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            S_StudentMapper studentmapper=session.getMapper(S_StudentMapper.class);
            int i=studentmapper.upDateStudentInformation(4,"李雷",21);
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.commit();
            session.close();
        }
    }
    @Test
    public void testGetClassStudentInformation(){
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            C_ClassMapper c_classMapper =session.getMapper(C_ClassMapper.class);
            List<C_Class>c_classes=c_classMapper.getClassStudentInformation(2);
            for (C_Class c_class : c_classes) {
                System.out.println(c_class);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
