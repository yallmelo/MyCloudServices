package br.com.ymsystem.apiproduct.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ProductController {

    @GetMapping("/")
    public ResponseEntity getTestProduct(){

        return new ResponseEntity("Product", HttpStatus.OK);
    }
}
