package com.library.entity.buider.bookbuilder;

import com.library.entity.Book;
import com.library.model.request.BookRequest;

import java.time.LocalDate;

public class RegisteredBook extends BookBuilder {

    BookRequest bookRequest;

    public RegisteredBook(BookRequest bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public void buid() {
        createNewBook();
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
