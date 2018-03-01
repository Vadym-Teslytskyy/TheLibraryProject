package com.library.controller;

import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class MainIndexController {

    private final BookService bookService;

    @Autowired
    public MainIndexController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public String findBestOfFourPerMonth(Model model) {
        LocalDateTime monthAgo = LocalDateTime.now().minusMonths(1);
        model.addAttribute("books", bookService.findBestBooksByPeriod(monthAgo, 4));
        model.addAttribute("bookAmountDuringIndep", bookService.findReleasedDuringIndependence());
        return "index";
    }
    @RequestMapping("/contact")
    public String showContactPage(Model model) {
        return "contact";
    }
    @GetMapping("/signin")
    public String getSingInPage(Model model) {
        return "signIn";
    }

}
