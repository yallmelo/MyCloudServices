package br.com.ymsystem.apiproduct.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public ResponseEntity getTestProduct(){
        return new ResponseEntity("Product -> "+ System.getenv("INSTANCE_NAME"),
                HttpStatus.OK);
    }
}
