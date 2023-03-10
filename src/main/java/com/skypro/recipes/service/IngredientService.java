package com.skypro.recipes.service;
import com.skypro.recipes.model.Ingredient;

public interface IngredientService {
    Ingredient addNewIngredient(Ingredient ingredient);
    Ingredient getIngredient(Long idIng);
}
