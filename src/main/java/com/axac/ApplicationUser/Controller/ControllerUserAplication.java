package com.axac.ApplicationUser.Controller;


import com.axac.ApplicationUser.Models.ApplicationUser;
import com.axac.ApplicationUser.Models.Post;
import com.axac.ApplicationUser.Repositoris.PostRepo;
import com.axac.ApplicationUser.Repositoris.UserRepository;
import com.axac.ApplicationUser.Security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerUserAplication {
    @Autowired
    UserDetailsServiceImpl userDetailsServiceImpl;
    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UserRepository appUserRepository;
    @Autowired
    PostRepo postRepo;

    @GetMapping("/signup")
    public String getSignUpPage(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signUpUser(@RequestParam String username, @RequestParam String password,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dateOfBirth,@RequestParam String bio){
        ApplicationUser applicationUser = new ApplicationUser(username, encoder.encode(password),firstName,lastName,dateOfBirth,bio);
        appUserRepository.save(applicationUser);
        return "login";
    }

    @GetMapping("/login")
    public String getLoginPage(){return "login";
    }

@GetMapping("/user/{id}")
public String getUser(Principal p, Model model, @PathVariable Long id){
    model.addAttribute("usernamePrincipal",p.getName());
    ApplicationUser applicationUser = appUserRepository.findById(id).get();
    model.addAttribute("userInformation",applicationUser);
    return "users.html";
}
    @GetMapping("/myprofile")
    public String getprofile(Principal p, Model model){
        model.addAttribute("usernamePrincipal",p.getName());
        ApplicationUser applicationUser = appUserRepository.findByUsername(p.getName());
        List<Post> postList = appUserRepository.findByUsername(p.getName()).getPostList();
        model.addAttribute("applicationUsers",applicationUser);
        model.addAttribute("postsList",postList);


        return "profile.html";
    }
    @GetMapping("/posts")
    public String allpost(Model m) {


        m.addAttribute("posts",postRepo.findAll() );
        return "post";
    }

    @PostMapping("/addpost")
    public RedirectView postprofile(Principal p, @RequestParam String body) {
        Post newpost = new Post(body, appUserRepository.findByUsername(p.getName()));
        postRepo.save(newpost);
        return new RedirectView("/profile");
    }



}