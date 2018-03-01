package com.library.admin.controller;

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
public class AdminClientController {

    private final ClientService clientService;

    @Autowired
    public AdminClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/signin")
    public String getSingInPage(Model model) {
        return "signIn";
    }

    @GetMapping("/clientRegistration")
    public String getRegistrationPage(Model model) {
        return "clientRegistration";
    }

    @ModelAttribute("newClientComponent")
    public ClientRequest getForm() {
        return new ClientRequest();
    }

    @PostMapping("/clientRegistration")
    public String save(@ModelAttribute("newClientComponent") ClientRequest request, SessionStatus status) {
        clientService.save(request);
        return cancel(status);
    }

    @GetMapping("/cleanClientFields")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/clientRegistration";
    }

}
