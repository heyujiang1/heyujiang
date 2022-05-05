package com.he.dao;

import com.he.pojo.C_Class;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface C_ClassMapper {
    @Select("select * from mybatis.c_class where id=#{cid}")
    C_Class getClassInformation(@Param("cid") int id);

    @Select("select * from mybatis.c_class where id=#{id}")
    @Results({@Result(property = "s_student",column ="id",
    many=@Many(select="com.he.dao.S_StudentMapper.getStudentInformationByClass")
    )})
    List<C_Class> getClassStudentInformation(int id);
}
