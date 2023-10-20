package com.example.restful_crud_mybatis;

import com.example.restful_crud_mybatis.entity.LanguageEntity;
import com.example.restful_crud_mybatis.service.LanguageService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
class RestfulCrudMybatisApplicationTests {

	@Autowired
	private LanguageService languageService;

	@Test
	void selectTest(){
		log.info("@@@@@@@@@ select Test");
		log.info(languageService.selectAll());
		log.info(languageService.selectById(6));
	}

	@Test
	void insertTest(){
		log.info("@@@@@@@@@ insert Test");
		LanguageEntity languageEntity = new LanguageEntity();
		languageEntity.setName("test");
		log.info(languageService.insert(languageEntity));
		log.info(languageService.selectAll());
	}

	@Test
	void updateTest(){
		log.info("@@@@@@@@@ update Test");
		LanguageEntity languageEntity2 = new LanguageEntity();
		languageEntity2.setName("test2");
		log.info(languageService.update(9, languageEntity2));
		log.info(languageService.selectAll());
	}

	@Test
	void deleteTest(){
		log.info("@@@@@@@@@ delete Test");
		log.info(languageService.deleteById(9));
		log.info(languageService.selectAll());
	}

}
