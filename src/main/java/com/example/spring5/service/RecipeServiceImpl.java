package com.example.spring5.service;

import com.example.spring5.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class RecipeServiceImpl implements RecipeService{

    @Override
    public Set<Recipe> getRecipes() {
        return null;
    }

    @Override
    public Recipe findById(Long l) {
        return null;
    }

    @Override
    public void deleteById(Long idToDelete) {

    }
}
