package bilal.springframework.spring5recipeapp.repositories;

import bilal.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
