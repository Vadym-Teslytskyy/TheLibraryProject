package com.library.repository.impl;

import com.library.entity.CopyOfBook;
import com.library.repository.CopyOfBookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CopyOfBookRepositoryImpl extends CrudRepositoryImpl<CopyOfBook, Integer>
        implements CopyOfBookRepository {

}
