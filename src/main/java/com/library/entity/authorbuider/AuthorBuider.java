package com.library.entity.authorbuider;

import com.library.entity.Author;

public abstract class AuthorBuider {

    Author author;

    public Author authorBuider() {
        return author;
    }

    public void createNewAuthor() {
        author = new Author();
    }

    public Author getAuthor() {
        return author;
    }

    public abstract void buidAuthor();
}
