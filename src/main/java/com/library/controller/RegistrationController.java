package com.library.controller;

import com.library.model.request.ClientRequest;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("newClientComponent")
public class RegistrationController {

    private final ClientService clientService;

    @GetMapping("/registration")
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

    @PostMapping("/registration")
    public String save(@ModelAttribute("newClientComponent") ClientRequest request, SessionStatus status) {
        clientService.save(request);
        return cancel(status);
    }

    @GetMapping
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/signin";
    }

}
