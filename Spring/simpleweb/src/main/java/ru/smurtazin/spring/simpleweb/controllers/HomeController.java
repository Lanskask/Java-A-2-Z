package ru.smurtazin.spring.simpleweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.smurtazin.spring.simpleweb.repositories.UserRepository;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home2")
    public String home(Model model) {
        model.addAttribute("message", "Home 2");
        return "home";
    }

    @GetMapping({"/", "*/app"})
    public String app(Model model) {
        model.addAttribute("message", "Hello Spr MVC!!!");
        return "home";
    }

    @GetMapping(path = "/users")
    public String getAllLoans(Model model) {
        model.addAttribute("users", this.userRepository.findAll());
        return "users";
    }

}
