package com.library.repository.impl;

import com.library.entity.Book;
import com.library.repository.AbstractRepository;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl extends AbstractRepository<Book, Integer>
        implements BookRepository {

}