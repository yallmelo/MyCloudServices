package br.com.ymsystem.apicustomer.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class CustomerController {

    @GetMapping("/")
    public ResponseEntity getTestURL() {
        return new ResponseEntity<>("Return test", HttpStatus.OK);

    }
}
