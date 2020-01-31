package api;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import api.models.User;
import api.repositories.UserRepository;

//import javax.inject.Inject;
import javax.inject.Inject;
import java.util.Optional;

@Controller("/user")
public class UserController {

    protected final UserRepository userRepository;

    @Inject
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Get("/")
    public String index() {
        User u = new User();
        u.setUsername("milan");
        u.setEmail("melamsal");
        u.setFullname("Milan Lamsal");
        return u.getEmail();
    }
}