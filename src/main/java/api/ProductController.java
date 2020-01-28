package api;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/product")
public class ProductController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}