package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationFormController {

    @RequestMapping("/registrationForm")
    public String theListOfAllBooks(Model model) {
        return "registrationForm";
    }

}
