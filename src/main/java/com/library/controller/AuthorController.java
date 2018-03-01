package com.library.controller;

import com.library.entity.Author;
import com.library.model.view.AuthorView;
import com.library.service.AuthorService;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    private final ClientService clientService;

    @Autowired
    public AuthorController(AuthorService authorService, ClientService clientService) {
        this.authorService = authorService;
        this.clientService = clientService;
    }

    @RequestMapping("/author/{id}")
    public String authorView(Model model, @PathVariable Integer id) {
        Author author = authorService.find(id);
        if (author != null) {
            Double averageClientsAge = clientService.findAverageAgeByAuthor(author.getId());
            AuthorView authorView = new AuthorView(author, averageClientsAge);
            model.addAttribute("authorView", authorView);
            return "authorView";
        } else {
            return "index"; // TODO Make authors.jsp as bookFilter.jsp and redirect there
        }
    }
}
