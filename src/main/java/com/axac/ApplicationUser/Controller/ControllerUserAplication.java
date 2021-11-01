package com.axac.ApplicationUser.Controller;


import com.axac.ApplicationUser.Models.ApplicationUser;
import com.axac.ApplicationUser.Repositoris.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ControllerUserAplication {


    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UserRepository appUserRepository;

    @GetMapping("/signup")
    public String getSignUpPage(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signUpUser(@RequestParam String username, @RequestParam String password,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dateOfBirth,@RequestParam String bio){
        ApplicationUser applicationUser = new ApplicationUser(username, encoder.encode(password),firstName,lastName,dateOfBirth,bio);
        ApplicationUser.userInformationForCaching=applicationUser;

        appUserRepository.save(applicationUser);
        return "login";
    }

    @GetMapping("/login")
    public String getLoginPage(){return "login";
    }
@PostMapping("/users/{id}.")
    public String usersData (@PathVariable int id, Model model){
ApplicationUser userInformation = appUserRepository.findById(id).orElseThrow();
    ApplicationUser.userInformationForCaching=userInformation;
model.addAttribute("userInformation",userInformation);
        return "userinformation";
}
}