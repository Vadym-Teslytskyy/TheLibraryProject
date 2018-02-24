package com.library.repository.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl extends CrudRepositoryImpl<Book, Integer>
        implements BookRepository {

}