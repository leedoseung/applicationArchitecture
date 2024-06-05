package com.application.architecture.applicationArchitecture.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "/hello";
    }

}
