package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClientStatistic {

    @GetMapping("/clientStatistic")
    public String getRegistrationPage(Model model) {
        return "clientStatistic";
    }
}
