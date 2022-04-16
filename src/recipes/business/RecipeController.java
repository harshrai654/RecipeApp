package recipes.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;


@RestController
public class RecipeController {

    final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/api/recipe/{id}")
    Recipe getRecipe(@PathVariable Long id) {
        if(recipeService.existsById(id)) {
            return recipeService.findRecipeById(id);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id does not exists");
    }

    @PostMapping("/api/recipe/new")
    Map<String, Long> saveRecipe(@RequestBody @Valid Recipe recipe) {
        Recipe savedRecipe = recipeService.save(recipe);

        return Map.of("id", savedRecipe.getId());
    }

    @DeleteMapping("/api/recipe/{id}")
    ResponseEntity deleteRecipe(@PathVariable Long id) {
        if(recipeService.existsById(id)) {
            recipeService.deleteRecipeById(id);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

    @PutMapping("/api/recipe/{id}")
    ResponseEntity updateRecipe(@RequestBody @Valid Recipe recipe, @PathVariable Long id) {
        if(recipeService.existsById(id)) {
            recipe.setId(id);
            recipeService.save(recipe);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

    @GetMapping("/api/recipe/search")
    List<Recipe> searchRecipes(@RequestParam(required = false) String category, @RequestParam(required = false) String name) {
        if(category == null && name == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if(category != null && name != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if(category != null) {
            return recipeService.findRecipesByCategory(category);
        }

        return recipeService.findRecipesContainingName(name);
    }

}
