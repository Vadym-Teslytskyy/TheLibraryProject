package com.library.entity.bookbuilder;

import com.library.entity.Author;
import com.library.entity.Genre;
import com.library.model.request.BookRequest;

import java.time.LocalDate;

public class RegisteredBook extends BookBuider {

    BookRequest bookRequest;

    public RegisteredBook(BookRequest bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public void buildBook() {
        Genre genre = new Genre();
        genre.setGenreName(bookRequest.getGenre());
        book.setGenre(genre);

        Author mainAuthor = new Author();
        mainAuthor.setFirstName(bookRequest.getMainAuthorFirstName());
        mainAuthor.setLastName(bookRequest.getMainAuthorLastName());
        book.setMainAuthor(mainAuthor);

        createNewBook();
        book.setName(bookRequest.getName());
        book.setPhotoUrl(bookRequest.getPhotoUrl());
        book.setGeneralCount(bookRequest.getGeneralCount());
        book.setAvailableCount(bookRequest.getGeneralCount());
        book.setFullDescription(bookRequest.getFullDescription());
        book.setReleaseDate(LocalDate.parse(bookRequest.getReleaseDate()));
    }

}
