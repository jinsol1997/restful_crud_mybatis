package com.example.restful_crud_mybatis.controller;

import com.example.restful_crud_mybatis.entity.LanguageEntity;
import com.example.restful_crud_mybatis.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("find/{id}")
    public ResponseEntity<LanguageEntity> getLanguageById(@PathVariable Integer id){

        LanguageEntity languageEntity = languageService.selectById(id);

        if(languageEntity != null){
            return new ResponseEntity<>(languageEntity, HttpStatus.OK);
        }

        return new ResponseEntity<>(languageEntity, HttpStatus.NOT_FOUND);
    }

    @GetMapping("findAll")
    public ResponseEntity<List<LanguageEntity>> getAllLanguage(){

        List<LanguageEntity> languageEntities = languageService.selectAll();

        if(languageEntities != null){
            return new ResponseEntity<>(languageEntities, HttpStatus.OK);
        }

        return new ResponseEntity<>(languageEntities, HttpStatus.NOT_FOUND);

    }

    @PostMapping("create")
    public ResponseEntity<LanguageEntity> createLanguage(@RequestBody LanguageEntity languageEntity){

        int result = languageService.insert(languageEntity);

        if(result > 0){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<LanguageEntity> updateLanguage(@PathVariable Integer id, @RequestBody LanguageEntity languageEntity){

        int result = languageService.update(id, languageEntity);

        if(result > 0){
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<LanguageEntity> deleteLanguage(@PathVariable Integer id){

        int result = languageService.deleteById(id);

        if(result > 0){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
