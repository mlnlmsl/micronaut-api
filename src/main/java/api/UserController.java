package api;

// import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

// import api.models.User;
import api.repositories.UserRepository;

//import javax.inject.Inject;
import javax.inject.Inject;
// import java.util.Optional;
// import java.util.List;

@Controller("/users")
public class UserController {

    @Inject UserRepository userRepository;

    // @Inject
    // public UserController(UserRepository userRepository) {
    //     this.userRepository = userRepository;
    // }


    @Get("/")
    public HttpResponse index() {
        return HttpResponse.ok().body(userRepository.findAll());
    }

    @Get("/{id}")
    public HttpResponse index(int id){
        return HttpResponse.ok().body(userRepository.findById(id));
    }
}