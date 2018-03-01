package com.library.service.impl;

import com.library.entity.Author;
import com.library.entity.builder.ClassBuider;
import com.library.entity.builder.authorbuider.RegisteredAuthor;
import com.library.model.request.AuthorRequest;
import com.library.repository.AuthorRepository;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

    @Override
    @Transactional
    public void save(AuthorRequest authorRequest) {
        ClassBuider<Author> classBuider = new RegisteredAuthor(authorRequest);
        classBuider.buid();
        getRepository().save(classBuider.getInstance());
    }
}
