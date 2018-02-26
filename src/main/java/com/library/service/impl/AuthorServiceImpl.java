package com.library.service.impl;

import com.library.entity.Author;
import com.library.repository.AuthorRepository;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends CrudServiceImpl<Author, Integer, AuthorRepository> implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public AuthorRepository getRepository() {
        return authorRepository;
    }

    @Override
    public Author findAuthorByBookId(Integer bookId) {
        Author author = authorRepository.findAuthorByBookId(bookId);
        return author;
    }
}
