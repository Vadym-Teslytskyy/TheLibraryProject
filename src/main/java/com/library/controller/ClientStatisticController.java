package com.library.controller;

import com.library.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientStatisticController {

    private final ClientService clientService;

    public ClientStatisticController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clientStatistic")
    public String getRegistrationPage(Model model) {
        model.addAttribute("clients", clientService.findAll());

//        System.out.println(clientService.getAllClientsId()); // працює
//        System.out.println(clientService.getUsingLibraryDaysCount(1)); // працює
        List<Integer> clientsId = clientService.getAllClientsId(); // працює

        List<Integer> usersLibraryUsingTime = new ArrayList<>();
        for (Integer id : clientsId) {
            usersLibraryUsingTime.add(clientService.getUsingLibraryDaysCount(id));
        }
        System.out.println(usersLibraryUsingTime);
        model.addAttribute("usingTime", usersLibraryUsingTime);
//        System.out.println(usersLibraryUsingTime);

        return "clientStatistic";
    }

}
