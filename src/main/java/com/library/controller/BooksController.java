package com.library.controller;

import com.library.model.request.BookFamousFilterRequest;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
@SessionAttributes("filter")
public class BooksController {

    private static final LocalDateTime MONTH_AGO = LocalDateTime.now().minusMonths(1);

    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("filter")
    public BookFamousFilterRequest getRequest() {
        return new BookFamousFilterRequest();
    }

    @RequestMapping("/")
    public String findBestOfFourPerMonth(Model model) {
        model.addAttribute("books", bookService.findBestBooksByPeriod(MONTH_AGO, 4));
        model.addAttribute("bookAmountDuringIndep", bookService.findReleasedDuringIndependence());
        return "index";
    }


    @GetMapping("/books/filter")
    public String showBooksByFilter(Model model, @ModelAttribute("filter") BookFamousFilterRequest request) {
        model.addAttribute("books", bookService.findBooksByFamousFilter(request));

        return "bookFilter";
    }

    @GetMapping("/books")
    public String showAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "bookFilter";
    }

}
