package com.test.travis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String main() {
        return "MAIN??@";
    }
}
