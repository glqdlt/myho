package com.glqdlt.myho.webapp.model.item;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class ArticleTest {

    final static ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void name() throws JsonProcessingException {
        Article article = new Article();
        article.setTitle("테스트제목");
        article.setWriter("jhun");
        article.setIdentity(1L);

        String aaa = objectMapper.writeValueAsString(article);
        System.out.println(aaa);
    }
}