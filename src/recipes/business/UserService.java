package recipes.business;

import org.springframework.stereotype.Service;
import recipes.persistence.UserCrudRepository;

@Service
public class UserService {
    private final UserCrudRepository userCrudRepository;

    UserService(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }

    User findUserByEmail(String email){
        return this.userCrudRepository.findUserByEmail(email);
    }

    User save(User user) {
        return userCrudRepository.save(user);
    }
}
