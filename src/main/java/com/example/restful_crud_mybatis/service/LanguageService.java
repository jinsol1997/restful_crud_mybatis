package com.example.restful_crud_mybatis.service;

import com.example.restful_crud_mybatis.entity.LanguageEntity;
import com.example.restful_crud_mybatis.mapper.LanguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageMapper languageMapper;

    public LanguageEntity selectById(Integer id){
        return languageMapper.findById(id);
    }

    public List<LanguageEntity> selectAll(){
        return languageMapper.findAll();
    }

    public int insert(LanguageEntity languageEntity){
        return languageMapper.insert(languageEntity);
    }

    public int update(Integer id, LanguageEntity languageEntity){
        return languageMapper.update(id, languageEntity);
    }

    public int deleteById(Integer id){
        return languageMapper.deleteById(id);
    }

}
