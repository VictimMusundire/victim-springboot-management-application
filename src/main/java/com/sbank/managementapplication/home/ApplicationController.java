package com.sbank.managementapplication.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/hr")
    public String products(){
        return "pages/hr/index";
    }

    @GetMapping("/fleet")
    public String fleet(){
        return "pages/fleet/index";
    }

    @GetMapping("/accounts")
    public String accounts(){
        return "pages/accounts/index";
    }

    @GetMapping("/payroll")
    public String payroll(){
        return "pages/payroll/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "pages/helpdesk/index";
    }

    @GetMapping("/parameters")
    public String parameters(){
        return "pages/parameters/index";
    }

}
