package com.axac.ApplicationUser.Controller;

import com.axac.ApplicationUser.Models.ApplicationUser;
import com.axac.ApplicationUser.Repositoris.UserRepository;
//import jdk.internal.jimage.ImageStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class GeneralController {
    public static    ApplicationUser userInformationForCaching;



    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String getHomePage(Model model){

        model.addAttribute("userId",userInformationForCaching);
        return "index";
    }

    @PostMapping("/UserInformation/{username}")
    public String showUserInformation(@PathVariable String username, Model m){
        if (userInformationForCaching.getUsername()!= null){
            m.addAttribute("info",userInformationForCaching);
        }else{
            ApplicationUser userInfo = userRepository.findByUsername(username);
            m.addAttribute("info",userInfo);

        }
        return "userinformation";
    }


}

//

//
