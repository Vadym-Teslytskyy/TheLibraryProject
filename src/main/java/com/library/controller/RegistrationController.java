package com.library.controller;

import com.library.model.request.ClientRequest;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("newClientComponent")
@RequestMapping("/registration")
public class RegistrationController {

    private final ClientService clientService;

    @GetMapping
    public String showRegistration(Model model){
        return "registration";
    }

    @Autowired
    public RegistrationController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ModelAttribute("newClientComponent")
    public ClientRequest getForm() {
        return new ClientRequest();
    }

    @PostMapping
    public String save(@ModelAttribute("newClientComponent") ClientRequest request, SessionStatus status) {
        clientService.save(request);
        return cancel(status);
    }

    @GetMapping("/cancel")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/signin";
    }

}
