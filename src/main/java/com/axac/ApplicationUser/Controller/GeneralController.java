package com.axac.ApplicationUser.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }

}

//

//
