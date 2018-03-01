package com.library.entity.builder.authorbuider;

import com.library.entity.Author;
import com.library.entity.builder.ClassBuider;

public abstract class AuthorClassBuider implements ClassBuider<Author> {

    public Author author;

    public void createNewAuthor() {
        author = new Author();
    }

}
