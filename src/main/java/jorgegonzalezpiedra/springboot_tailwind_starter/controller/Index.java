package jorgegonzalezpiedra.springboot_tailwind_starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @GetMapping("/")
    public String init() {
        return "index";
    }
}
