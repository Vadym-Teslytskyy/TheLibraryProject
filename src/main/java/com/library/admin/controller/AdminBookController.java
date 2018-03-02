package com.library.admin.controller;

import com.library.model.request.BookRequest;
import com.library.service.AuthorService;
import com.library.service.BookService;
import com.library.service.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("newBookComponent")
public class AdminBookController {

    private final BookService bookService;
    private final GenreService genreService;
    private final AuthorService authorService;

    public AdminBookController(BookService bookService, GenreService genreService, AuthorService authorService) {
        this.bookService = bookService;
        this.genreService = genreService;
        this.authorService = authorService;
    }

    //    @GetMapping("/bookRegistration")
//    public String getRegistrationPage(Model model) {
//        return "bookRegistration";
//    }

    @ModelAttribute("newBookComponent")
    public BookRequest getForm() {
        return new BookRequest();
    }

    @PostMapping("/adminBook")
    public String save(@ModelAttribute("newBookComponent") BookRequest request, SessionStatus status) {
        bookService.save(request);
        return "redirect:/adminBook";
    }

//    @GetMapping("/cleanBookFields")
//    public String cancel(SessionStatus status) {
//        status.setComplete();
//        return "redirect:/bookRegistration";
//    }

    @GetMapping("/adminBook")
    public String getRegistrationPage1(Model model) {
        model.addAttribute("genres", genreService.findAll());
        model.addAttribute("authors", authorService.findAll());
        return "adminBook";
    }

}
