package com.library.controller;

import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class BooksController {

    private static final LocalDateTime MONTH_AGO = LocalDateTime.now().minusMonths(1);

    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public String findBestOfFourPerMonth(Model model, HttpServletRequest httpServletRequest) {
        model.addAttribute("books", bookService.findBestBooksByPeriod(MONTH_AGO, 4));
        return "index";
    }

    @RequestMapping("/theListOfAllBooks")
    public String theListOfAllBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "theListOfAllBooks";
    }
}
