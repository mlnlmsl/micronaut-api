package api;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/user")
public class UserController {
    private User user;
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}