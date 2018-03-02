package com.library.controller.admin;

import com.library.model.request.AuthorRequest;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("newAuthorComponent")
public class AdminAuthorController {

    private final AuthorService authorService;

    @Autowired
    public AdminAuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/admin/author")
    public String getAuthorAdminPage(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "adminAuthor";
    }

    @ModelAttribute("newAuthorComponent")
    public AuthorRequest getForm() {
        return new AuthorRequest();
    }

    @PostMapping("/admin/author/save")
    public String save(@ModelAttribute("newAuthorComponent") AuthorRequest request, SessionStatus status) {
        authorService.save(request);
        return cancel(status);
    }

    @GetMapping("/cencelAuthorFields")
    public String cancel(SessionStatus status) {
        status.setComplete();
        return "redirect:/admin/author";
    }

    @RequestMapping("/admin/author/delete/{id}")
    public String delete(@PathVariable int id) {
        authorService.delete(id);
        return "redirect:/admin/author";
    }

    @RequestMapping("/admin/author/updating/{id}")
    public String updating(@PathVariable int id, Model model) {
        model.addAttribute("author", authorService.find(id));
        return "redirect:/admin/author";
    }
}
