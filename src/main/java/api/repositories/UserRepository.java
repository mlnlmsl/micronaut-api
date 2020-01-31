package api.repositories;

import api.models.User;
import io.micronaut.data.repository.CrudRepository;


//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import java.util.List;
//import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Long> {


}
