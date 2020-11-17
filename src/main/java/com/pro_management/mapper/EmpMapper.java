package com.pro_management.mapper;

import com.pro_management.model.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpMapper {

    @Insert("insert into emp values(#{id},#{empName},#{empDepartment},#{empPost},#{empSex})")
    public void insert(Emp emp);

    @Select("select * from emp where id = #{empId}")
    public Emp getById(int empId);

    //pro with emp
    /*
    @Select("select * from emp where id = #{empId}")
    @Results({
            @Result(property = "pro",column = "id",one = @One(select = "com.pro_management.mapper.ProMapper.getByIdPro"))
    })
    public Emp getEmpWithPro(int empId);
    */

    @Select("select * from emp")
    public List<Emp> list();

    @Update("update emp set id = #{id}," +
            "empName = #{empName}," +
            "empDepartment = #{empDepartment}," +
            "empPost = #{empPost}," +
            "empSex = #{empSex} where id = #{id}")
    public void update(Emp emp);

    @Delete("delete from emp where id = #{empId}")
    public void delete(int empId);


}
