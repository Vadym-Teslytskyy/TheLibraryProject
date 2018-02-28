package com.library.controller;

import com.library.entity.Book;
import com.library.model.view.BookView;
import com.library.service.BookService;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class BooksController {

    private static final LocalDateTime MONTH_AGO = LocalDateTime.now().minusMonths(1);

    private final BookService bookService;

    private final ClientService clientService;

    @Autowired
    public BooksController(BookService bookService, ClientService clientService) {
        this.bookService = bookService;
        this.clientService = clientService;
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

    @RequestMapping("/book/{id}")
    public String bookView(Model model, @PathVariable Integer id) {
        Book book = bookService.find(id);
        if (book != null) {
            Double averageClientsAge = clientService.findAverageAgeByBook(book.getId());
            BookView bookView = new BookView(book, averageClientsAge);
            model.addAttribute("book", bookView);
            return "bookView";
        } else {
            return "bookFilter";
        }
    }
}
