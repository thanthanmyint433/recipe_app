package com.example.spring5.controller;

import com.example.spring5.repositories.CategoryRepository;
import com.example.spring5.repositories.UnitOfMeasureRepository;
import com.example.spring5.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.info("Getting index page");
        model.addAttribute("recipes", recipeService.getRecipes());
log.info("model"+recipeService.getRecipes());
        return "index";
    }
}
