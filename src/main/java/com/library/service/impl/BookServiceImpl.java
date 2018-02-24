package com.library.service.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends CrudServiceImpl<Book, Integer, BookRepository> implements BookService {

    private BookRepository bookRepository;
    @Override
    public BookRepository getRepository() {
        return bookRepository;
    }
}
