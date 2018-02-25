package com.library.repository.impl;

import com.library.entity.Genre;
import com.library.repository.GenreRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GenreRepositoryImpl extends CrudRepositoryImpl<Genre, Integer>
        implements GenreRepository {

}
