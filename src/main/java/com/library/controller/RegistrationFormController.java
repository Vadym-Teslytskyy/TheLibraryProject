package com.library.controller;

import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationFormController {

    private final ClientService clientService;

    @Autowired
    public RegistrationFormController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/signin")
    public String getSingInPage(Model model) {
        return "signIn";
    }

    @RequestMapping("/registration")
    public String theListOfAllBooks(Model model) {
        return "registrationForm";
    }

}
