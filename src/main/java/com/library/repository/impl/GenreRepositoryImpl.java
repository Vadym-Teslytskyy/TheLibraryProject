package com.library.repository.impl;

import com.library.entity.Genre;
import com.library.repository.AbstractRepository;
import com.library.repository.GenreRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GenreRepositoryImpl extends AbstractRepository<Genre, Integer>
        implements GenreRepository {

}
