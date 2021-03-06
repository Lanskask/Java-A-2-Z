package ru.smurtazin.spring.secondannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.smurtazin.spring.secondannotations.models.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class  UserController {
    final List<User> users = new CopyOnWriteArrayList<>();

    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public String showItems(ModelMap model) {
        model.addAttribute("users", this.users);
        return "users";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String addItem(@ModelAttribute User user) {
        this.users.add(user);
        return "redirect:users.do";
    }
}
