package com.axac.ApplicationUser.Controller;

import com.axac.ApplicationUser.Repositoris.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

@Controller
public class GeneralController {



    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String getHomePage(Principal p, Model model){
        if(p==null){
            return "error.html";
        }
        else {
            model.addAttribute("usernamePrincipal", p.getName());
            return "home.html";
        }
    }


//    @PostMapping("/UserInformation/{username}")
//    public String showUserInformation(@PathVariable String username, Model m){
//        if (userInformationForCaching.getUsername()!= null){
//            m.addAttribute("info",userInformationForCaching);
//        }else{
//            ApplicationUser userInfo = userRepository.findByUsername(username);
//            m.addAttribute("info",userInfo);
//
//        }
//        return "userinformation";
//    }


}

//

//