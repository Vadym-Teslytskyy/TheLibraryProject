package com.library.controller.admin;

import com.library.entity.Genre;
import com.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminGenreController {

    private final GenreService genreService;

    @Autowired
    public AdminGenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/admin/genre")
    public String getRegistrationPage(Model model) {
        return "adminGenre";
    }

    @PostMapping("/admin/genre")
    public String save(@RequestParam String genreName) {
        Genre genre = new Genre();
        genre.setGenreName(genreName);
        genreService.save(genre);
        return "redirect:/adminGenre";
    }
}
