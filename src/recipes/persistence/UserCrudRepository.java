package recipes.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.business.Recipe;
import recipes.business.User;

import java.util.List;

@Repository
public interface UserCrudRepository extends CrudRepository<User, Long> {
    User findUserByEmail(String email);
}
