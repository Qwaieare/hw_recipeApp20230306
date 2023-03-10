package com.skypro.recipes.controller;
import com.skypro.recipes.model.Recipe;
import com.skypro.recipes.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Recipe")
public class RecipeController {
    private RecipeService recipeService;

    @GetMapping
    public String start() {
        return "Приложение запущено";
    }

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/getrecipe")
   public Recipe getRecipe(@RequestParam Long idRec) {
        return recipeService.getRecipe(idRec);
    }

    @GetMapping("/addrecipe")
    public void addNewRecipe(@RequestParam Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }

}
