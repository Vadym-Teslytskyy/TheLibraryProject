package com.library.service;

import com.library.entity.Author;

public interface AuthorService extends CrudService<Author, Integer> {
    Author findAuthorByBookId(Integer bookId);
}
