package com.library.entity.bookbuilder;

import com.library.entity.Book;

public abstract class BookBuider {

    Book book;

    public Book bookBuider() {
        return book;
    }

    public void createNewBook() {
        book = new Book();
    }

    public Book getBook() {
        return book;
    }

    public abstract void buildBook();
}
