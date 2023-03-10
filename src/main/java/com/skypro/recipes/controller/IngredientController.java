package com.skypro.recipes.controller;
import com.skypro.recipes.model.Ingredient;
import com.skypro.recipes.service.IngredientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @GetMapping("/getingredient")
    public Ingredient getIngredient(@RequestParam Long idIng) {
        return ingredientService.getIngredient(idIng);
    }

    @GetMapping("/addingredient")
    public Ingredient addNewIngredient(@RequestParam Ingredient ingredient) {
        return ingredientService.addNewIngredient(ingredient);
    }
}
