package com.example.restful_crud_mybatis.mapper;

import com.example.restful_crud_mybatis.entity.LanguageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LanguageMapper {

    LanguageEntity findById(Integer id);

    List<LanguageEntity> findAll();

    int insert(LanguageEntity languageEntity);

    int update(@Param("id") Integer id, @Param("languageEntity") LanguageEntity languageEntity);

    int deleteById(Integer id);

}
