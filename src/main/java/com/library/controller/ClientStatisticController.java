package com.library.controller;

import com.library.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientStatisticController {

    private final ClientService clientService;

    public ClientStatisticController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clientStatistic")
    public String getRegistrationPage(Model model) {
        model.addAttribute("clients", clientService.findAll());
        return "clientStatistic";
    }

}
