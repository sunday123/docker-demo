package com.ij34.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping(value = "/hello")
    public String test() {
        return "hello docker | " + new Date();
    }
}
