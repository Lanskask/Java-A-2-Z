package ru.smurtazin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.smurtazin.domain.Person;
import ru.smurtazin.service.PersonService;

@Controller
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons")
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("persons");
        model.addObject("persons", this.service.getAll());
        return model;
    }

    @PostMapping("/persons")
    public String add(@ModelAttribute Person person) {
        this.service.add(person);
        return "redirect:persons";
    }

}
