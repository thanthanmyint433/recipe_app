package com.example.spring5.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CategoryTest {

    Category category;
    @Before
    public void setUp(){

    category=new Category();

}
    @Test
    public void getId() throws Exception {
        Long idValue= 4L ;

        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }

}