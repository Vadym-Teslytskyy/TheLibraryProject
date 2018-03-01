package com.library.entity.buider.bookbuilder;

import com.library.entity.Author;
import com.library.entity.Book;
import com.library.entity.Genre;
import com.library.model.request.BookRequest;

import java.time.LocalDate;

public class RegisteredBook extends BookBuilder {

    private BookRequest bookRequest;

    public RegisteredBook(BookRequest bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public void buid() {
        Genre genre = new Genre();
        genre.setId(Integer.valueOf(bookRequest.getGenre()));
        Author author = new Author();
        author.setId(Integer.valueOf(bookRequest.getAuthor()));
        createNewBook();
        book.setGenre(genre);
        book.setMainAuthor(author);
        book.setName(bookRequest.getName());
        book.setPhotoUrl(bookRequest.getPhotoUrl());
        book.setGeneralCount(bookRequest.getGeneralCount());
        book.setAvailableCount(bookRequest.getGeneralCount());
        book.setFullDescription(bookRequest.getFullDescription());
        book.setReleaseDate(LocalDate.parse(bookRequest.getReleaseDate()));
    }

    @Override
    public Book getInstance() {
        return book;
    }
}
