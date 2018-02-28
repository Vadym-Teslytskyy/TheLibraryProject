package com.library.controller;

import com.library.model.request.ClientRequest;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("clientComponent")
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

    @GetMapping("/registration")
    public String getRegistrationPage(Model model) {
        return "registration";
    }

    @ModelAttribute("clientComponent")
    public ClientRequest getForm() {
        return new ClientRequest();
    }

    @PostMapping("/registration")
    public String save(@ModelAttribute("clientComponent") ClientRequest request, SessionStatus status) {
        clientService.save(request);
        return cancel(status);
    }

    @GetMapping("/cancel")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/registration";
    }

}
