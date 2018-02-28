package com.library.entity.bookbuilder;

import com.library.model.request.BookRequest;

public class RegisteredBook extends BookBuider {

    BookRequest bookRequest;

    public RegisteredBook(BookRequest bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public void buildBook() {
        createNewBook();
        book.setName(bookRequest.getName());
//        book.setMainAuthor(bookRequest.getMainAuthor());
//        book.setGenre(bookRequest.getGenre());
        book.setPhotoUrl(bookRequest.getPhotoUrl());
        book.setGeneralCount(bookRequest.getGeneralCount());
        book.setAvailableCount(bookRequest.getGeneralCount());
        book.setFullDescription(bookRequest.getFullDescription());
        book.setReleaseDate(bookRequest.getReleaseDate());
    }

}
