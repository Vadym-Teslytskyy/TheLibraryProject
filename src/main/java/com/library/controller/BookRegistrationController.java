package com.library.controller;

import com.library.entity.Book;
import com.library.model.request.BookRequest;
import com.library.model.request.ClientRequest;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("newBookComponent")
public class BookRegistrationController {

    private final BookService bookService;

    @Autowired
    public BookRegistrationController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/bookRegistration")
    public String getRegistrationPage(Model model) {
        return "bookRegistration";
    }

    @ModelAttribute("newBookComponent")
    public BookRequest getForm() {
        return new BookRequest();
    }

    @PostMapping("/bookRegistration")
    public String save(@ModelAttribute("newBookComponent") BookRequest request, SessionStatus status) {
        Book book = new Book();
        book.setName(request.getName());
        bookService.save(book);
        return "redirect:/bookRegistration";
    }

    @GetMapping("/cancel")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/bookRegistration";
    }

}
