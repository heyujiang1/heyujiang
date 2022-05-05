package com.he.dao;


import com.he.pojo.Employee;
import com.he.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmployeeDaoTest {
    @Test
    public void testGetUserById() {
        SqlSession session = MybatisUtil.getSqlSession();
        try {
            EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
            int id=1;
            Employee employee=mapper.GetUserById(id);
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Test
    public void testAddEmployeeInformation() {
        SqlSession session = MybatisUtil.getSqlSession();
        try {
            EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
           Employee employee=new Employee();
           employee.setId(4);
           employee.setName("贺玉江");
           employee.setAge(21);
           employee.setPosition("经理");
           int id;
           id=mapper.addEmployeeInformation(employee);
           session.commit();
            System.out.println(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Test
    public void testUpdateEmployeeInformationById() {
        SqlSession session = MybatisUtil.getSqlSession();
        try {
            EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
            Employee employee=new Employee();
            employee.setId(4);
            employee.setName("贺鹏");
            employee.setAge(20);
            employee.setPosition("经理");
            int amount;
            amount=mapper.updateEmployeeInformationById(employee);
            session.commit();
            System.out.println(amount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Test
    public void testDeleteEmployeeInformationById() {
        SqlSession session = MybatisUtil.getSqlSession();
        try {
            EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
            int id=1,amount;
            amount=mapper.deleteEmployeeInformationById(id);
            System.out.println(amount);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}



