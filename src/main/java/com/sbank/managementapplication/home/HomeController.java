package com.sbank.managementapplication.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "pages/dashboard";
    }

    @GetMapping("/products")
    public String products(){
        return "pages/dashboard";
    }
}
