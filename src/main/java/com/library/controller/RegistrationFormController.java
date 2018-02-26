package com.library.controller;

import com.library.entity.Client;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationFormController {


    private final ClientService clientService;

    @Autowired
    public RegistrationFormController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/registrationForm")
    public String theListOfAllBooks(Model model) {
        return "registrationForm";
    }


    @PostMapping
    public String save(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String login, @RequestParam String birthDate, @RequestParam String password, @RequestParam String phoneNumber, @RequestParam String homeAdress) {
        Client client = new Client();
        client.setFirstName(firstName);
        client.setFirstName(lastName);
        client.setFirstName(login);
//        client.setFirstName(birthDate);
        client.setFirstName(password);
        client.setFirstName(phoneNumber);
        client.setFirstName(homeAdress);
        clientService.save(client);
        return "redirect:/registrationForm";
    }

}
