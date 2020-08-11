package com.example.spring5.controller;
import com.example.spring5.domain.Category;
import com.example.spring5.domain.UnitOfMeasure;

import com.example.spring5.repositories.CategoryRepository;
import com.example.spring5.repositories.UnitOfMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {
    private CategoryRepository cateRepository;
    private UnitOfMeasureRepository unitofMeasureRepository;

    public IndexController(CategoryRepository cateRepository, UnitOfMeasureRepository unitofMeasureRepository) {
        this.cateRepository = cateRepository;
        this.unitofMeasureRepository = unitofMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        log.debug("Getting index page");
        Optional<Category> category= cateRepository.findByDescription("american1");
        Optional<UnitOfMeasure> unitOfMeasure=unitofMeasureRepository.findByDescription("m4");
        //System.out.println("database>>>>>>"+category.get().getId());
       // System.out.println("database>>>>>>"+unitOfMeasure.get().getId());
        return "index";
    }
}
