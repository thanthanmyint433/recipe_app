package com.example.spring5.service;

import com.example.spring5.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    //RecipeCommand saveRecipeCommand(RecipeCommand command);
   // RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);
}
