package br.com.ymsystem.apicustomer.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathCentral {
    @GetMapping("/")
    public ResponseEntity getPathInitial(){

        return new ResponseEntity("Path Not Implemented", HttpStatus.NOT_IMPLEMENTED);
    }
}
