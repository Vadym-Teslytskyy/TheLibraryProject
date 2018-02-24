package com.library.service;

import com.library.repository.Repository;

import java.io.Serializable;
import java.util.List;

public interface CrudService<E, PK extends Serializable> {

    void save(E entity);

    void update(E entity);

    void delete(PK primaryKey);

    E find(PK primaryKey);

    List<E> findAll();

    Repository<E, PK> getRepository();
}
