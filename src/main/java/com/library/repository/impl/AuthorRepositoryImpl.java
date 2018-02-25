package com.library.repository.impl;

import com.library.entity.Author;
import com.library.repository.AuthorRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryImpl extends CrudRepositoryImpl<Author, Integer>
        implements AuthorRepository {

}
