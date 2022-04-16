package recipes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recipes.business.Recipe;

import java.util.List;

@Repository
public interface RecipeCrudRepository extends JpaRepository<Recipe, Long> {
    Recipe findRecipeById(Long Id);
    void deleteRecipeById(Long Id);
    List<Recipe> findRecipesByNameContainingIgnoreCaseOrderByDateDesc(String name);
    List<Recipe> findRecipesByCategoryIgnoreCaseOrderByDateDesc(String category);
}
