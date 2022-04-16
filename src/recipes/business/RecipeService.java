package recipes.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.persistence.RecipeCrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RecipeService {
    private final RecipeCrudRepository recipeCrudRepository;

    @Autowired
    public RecipeService(RecipeCrudRepository recipeCrudRepository) {
        this.recipeCrudRepository = recipeCrudRepository;
    }

    public Recipe findRecipeById(Long id) {
        return recipeCrudRepository.findRecipeById(id);
    }

    public List<Recipe> findRecipesContainingName(String name){return recipeCrudRepository.findRecipesByNameContainingIgnoreCaseOrderByDateDesc(name);}

    public List<Recipe> findRecipesByCategory(String category){return recipeCrudRepository.findRecipesByCategoryIgnoreCaseOrderByDateDesc(category);}

    public Recipe save(Recipe newRecipe) {
        return recipeCrudRepository.save(newRecipe);
    }

    @Transactional
    public void deleteRecipeById(Long id) {
        recipeCrudRepository.deleteRecipeById(id);
    }

    public boolean existsById(Long id){
        return recipeCrudRepository.existsById(id);
    }
}
