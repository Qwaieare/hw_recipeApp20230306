package com.skypro.recipes.service;
import com.skypro.recipes.model.Recipe;

public interface RecipeService {
    Recipe addNewRecipe(Recipe recipe);
    Recipe getRecipe(Long idRec);

}
