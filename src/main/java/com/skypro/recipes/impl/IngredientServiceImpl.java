package com.skypro.recipes.impl;

import com.skypro.recipes.model.Ingredient;
import com.skypro.recipes.service.IngredientService;

import java.util.LinkedHashMap;
import java.util.Map;

public class IngredientServiceImpl implements IngredientService {
    private static final Map<Long, Ingredient> ingredientsL = new LinkedHashMap<>();
    private static Long idIng = 0L;

    @Override
    public Ingredient addNewIngredient(Ingredient ingredient) {
        ingredientsL.putIfAbsent(idIng++, ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(Long idIng) {
        return ingredientsL.get(idIng);
    }
}
