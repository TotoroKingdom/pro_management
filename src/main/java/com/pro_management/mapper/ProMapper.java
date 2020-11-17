package com.pro_management.mapper;

import com.pro_management.model.Pro;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProMapper {
    @Insert("insert into pro values(#{id},null,#{proTitle},#{proText},#{createDate})")
    public void insertPro(Pro pro);

    @Select("select * from pro where proId = #{proId}")
    public Pro getByIdPro(int proId);

    @Select("select * from pro")
    public List<Pro> listPro();

    //@Select("select emp.empName,pro.proTitle,pro.proText,pro.createDate from emp,pro where emp.id=pro.id")


    @Update("update pro set id = #{id}," +
            "proId = #{proId}," +
            "proTitle = #{proTitle}," +
            "proText = #{proText}," +
            "createDate = #{createDate} where proId = #{proId}")
    public void updatePro(Pro pro);

    @Delete("delete from pro where proId = #{proId}")
    public void deletePro(int proId);


}
