package com.library.entity.builder.bookbuilder;

import com.library.entity.Book;
import com.library.entity.builder.ClassBuider;

public abstract class BookBuider implements ClassBuider<Book> {

    Book book;

    public void createNewBook() {
        book = new Book();
    }

}
