package recipes.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.persistence.RecipeCrudRepository;

import javax.transaction.Transactional;

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
