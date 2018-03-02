package com.library.controller;

import com.library.entity.Book;
import com.library.model.filter.BookFilter;
import com.library.model.request.BookFilterRequest;
import com.library.model.view.BookView;
import com.library.service.BookService;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("filter")
public class BookController {

    private final BookService bookService;

    private final ClientService clientService;

    @Autowired
    public BookController(BookService bookService, ClientService clientService) {
        this.bookService = bookService;
        this.clientService = clientService;
    }

    @ModelAttribute("filter")
    public BookFilterRequest getRequest() {
        return new BookFilterRequest();
    }


    @GetMapping("/books/filter")
    public String showBooksByFilter(Model model, @ModelAttribute("filter") BookFilterRequest request) {
        model.addAttribute("books", bookService.findBooksByFilter(BookFilter.parseRequest(request)));
        return "bookFilter";
    }


    @GetMapping("/books")
    public String showAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "bookFilter";
    }
    @GetMapping("/books/cancel")
    public String cancel(SessionStatus status){
        status.setComplete();
        return "redirect:/books";
    }

    @RequestMapping("/book/{id}")
    public String bookView(Model model, @PathVariable Integer id) {
        Book book = bookService.find(id);
        if (book != null) {
            Double averageClientsAge = clientService.findAverageAgeByBook(book.getId());
            Long rentCount = bookService.getRentCount(book.getId());
            BookView bookView = new BookView(book, averageClientsAge, rentCount);
            model.addAttribute("bookView", bookView);
            return "bookView";
        } else {
            return "bookFilter";
        }
    }
}
