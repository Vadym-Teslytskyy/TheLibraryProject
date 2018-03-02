package com.library.controller.admin;

import com.library.model.request.BookRequest;
import com.library.service.AuthorService;
import com.library.service.BookService;
import com.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public AdminBookController(BookService bookService, GenreService genreService, AuthorService authorService) {
        this.bookService = bookService;
        this.genreService = genreService;
        this.authorService = authorService;
    }

    @ModelAttribute("newBookComponent")
    public BookRequest getForm() {
        return new BookRequest();
    }

    @PostMapping("/admin/book/save")
    public String save(@ModelAttribute("newBookComponent") BookRequest request, SessionStatus status) {
        bookService.save(request);
        return cancel(status);
    }

    @GetMapping("/cencelBookFields")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/admin/book";
    }

    @GetMapping("/admin/book")
    public String getRegistrationPage1(Model model) {
        model.addAttribute("genres", genreService.findAll());
        model.addAttribute("authors", authorService.findAll());
        return "adminBook";
    }

}
