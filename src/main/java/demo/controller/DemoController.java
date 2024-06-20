package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping()
    public String helloWorld(){
        return "Hello World Version: 0.0.1";
    }
}