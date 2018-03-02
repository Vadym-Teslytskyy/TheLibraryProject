package com.library.controller.admin;

import com.library.entity.Book;
import com.library.entity.Client;
import com.library.model.view.ClientStatisticView;
import com.library.model.view.ClientView;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminClientController {

    private ClientService clientService;

    @Autowired
    public AdminClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String showClients(Model model) {
        List<Client> clients = clientService.findAll();
        List<ClientView> clientViews = new ArrayList<>();
        if (!clients.isEmpty()) {
            for (Client client : clients) {
                Integer usingLibraryDaysCount = clientService.getUsingLibraryDaysCount(client.getId());
                List<Book> notReturnedBooks = clientService.findNotReturnedBooks(client.getId());
                clientViews.add(new ClientView(client, usingLibraryDaysCount, notReturnedBooks));
            }
        } else {
            return "index"; // TODO Create adminMenu.jsp
        }
        model.addAttribute("clientViews", new ArrayList<>());
        return "clients";
    }

    @GetMapping("/clientsStatistic")
    public String showClientsStatistic(Model model) {
        List<Client> clients = clientService.findAll();
        ClientStatisticView clientStatisticView;
        if (!clients.isEmpty()) {
            Double averageClientsAge = clientService.getAverageAge();
            Double averageUsingLibraryDaysCount = clientService.getAverageUsingLibraryDaysCount();
            BigDecimal averageRentsCountByPeriod = clientService.getAverageRentsCountByPeriod(
                    LocalDateTime.now().minusYears(1), LocalDateTime.now()); // TODO This magic month must be realized as a filter
            clientStatisticView = new ClientStatisticView(
                    averageClientsAge, averageUsingLibraryDaysCount, averageRentsCountByPeriod);
        } else {
            return "index"; // TODO Create adminMenu.jsp and redirect there
        }
        model.addAttribute("clientStatisticView", clientStatisticView);
        return "clientsStatistic";
    }
}
