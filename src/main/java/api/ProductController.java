package api;

import api.models.Product;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
// import io.micronaut.http.HttpStatus;
import api.repositories.ProductRepository;
import javax.inject.Inject;
import javax.validation.Valid;
@Controller("/product")
public class ProductController {
    @Inject ProductRepository productRepo;

    @Get("/")
    public HttpResponse index() {
        return HttpResponse.ok().body(productRepo.findAll());
    }

    @Post("/")
    public HttpResponse save(@Body @Valid Product prod){
        productRepo.save(prod);
        return HttpResponse.ok().body("Saved");
    }
}