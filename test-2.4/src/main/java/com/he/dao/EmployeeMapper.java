package com.he.dao;

import com.he.pojo.Employee;
import java.util.List;


public interface EmployeeMapper {
    Employee GetUserById(int id);
    int addEmployeeInformation(Employee employee);
    int updateEmployeeInformationById(Employee employee);
    int deleteEmployeeInformationById(int id);

}
