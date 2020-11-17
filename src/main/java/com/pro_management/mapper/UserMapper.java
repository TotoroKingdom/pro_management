package com.pro_management.mapper;

import com.pro_management.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Insert("insert into user values(#{id},#{username},#{password})")
    public void insertUser(User user);

    @Select("select * from user where id = #{userId}")
    public User getByIdUser(int userId);

    @Select("select * from user")
    public List<User> listUser();

    @Update("update user set id = #{id}," +
            "username = #{username}," +
            "password = #{password} where id = #{id}")
    public void updateUser(User user);

    @Delete("delete from user where id = #{userId}")
    public void deleteUser(int userId);

}
