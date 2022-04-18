package recipes.business;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
public class RecipeController {

    private final RecipeService recipeService;
    private final UserService userService;

    public RecipeController(RecipeService recipeService, UserService userService) {
        this.recipeService = recipeService;
        this.userService = userService;
    }

    @GetMapping("/api/recipe/{id}")
    Recipe getRecipe(@PathVariable Long id) {
        if(recipeService.existsById(id)) {
            return recipeService.findRecipeById(id);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id does not exists");
    }

    @PostMapping("/api/recipe/new")
    Map<String, Long> saveRecipe(@RequestBody @Valid Recipe recipe, @AuthenticationPrincipal UserDetailsImpl details) {
        User author = userService.findUserByEmail(details.getUsername());
        recipe.setUserId(author);

        Recipe savedRecipe = recipeService.save(recipe);
        return Map.of("id", savedRecipe.getId());
    }

    @DeleteMapping("/api/recipe/{id}")
    ResponseEntity deleteRecipe(@PathVariable Long id, @AuthenticationPrincipal UserDetailsImpl details) {
        if(recipeService.existsById(id)) {
            Recipe recipe = recipeService.findRecipeById(id);
            if(Objects.equals(recipe.getUserId().getEmail(), details.getUsername())) {
                recipeService.deleteRecipeById(id);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/api/recipe/{id}")
    ResponseEntity updateRecipe(@RequestBody @Valid Recipe recipe, @PathVariable Long id, @AuthenticationPrincipal UserDetailsImpl details) {
        Recipe savedRecipe = recipeService.findRecipeById(id);
        if(savedRecipe != null) {
            if(Objects.equals(savedRecipe.getUserId().getEmail(), details.getUsername())) {
                recipe.setId(id);
                recipe.setUserId(savedRecipe.getUserId());
                recipeService.save(recipe);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
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
