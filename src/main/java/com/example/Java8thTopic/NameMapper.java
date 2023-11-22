package com.example.Java8thTopic;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();

// prefixは接頭辞という意味
    @Select("SELECT * FROM names WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%', #{suffix}) AND name LIKE CONCAT('%', #{contains}, '%')")
    List<Name> findByNameStartingWith(String prefix,String suffix,String contains);
}
