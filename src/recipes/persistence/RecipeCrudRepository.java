package recipes.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.business.Recipe;

@Repository
public interface RecipeCrudRepository extends CrudRepository<Recipe, Long> {
    Recipe findRecipeById(Long Id);
    void deleteRecipeById(Long Id);
}
