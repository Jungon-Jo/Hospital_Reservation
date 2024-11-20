package com.asklepios.hospitalreservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class asklepiosController {

    @GetMapping("/")
    public String home() {
        return "call";
    }

    @GetMapping("/return")
    public String retunr() {
        return "return";
    }
}
