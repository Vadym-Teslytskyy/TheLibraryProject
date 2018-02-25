package com.library.repository.impl;

import com.library.entity.Book;
import com.library.entity.Client;
import com.library.repository.ClientRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class ClientRepositoryImpl extends CrudRepositoryImpl<Client, Integer>
        implements ClientRepository {

    @Override
    public List<Book> findReadBooks(int clientId) {
        return null;
    }

    @Override
    public List<Book> findNotReturnedBooks(int clientId) {
        return null;
    }

    @Override
    public Integer getUsingLibraryDays(int clientId) {
        return null;
    }

    @Override
    public List<Client> findDebtors() {
        return null;
    }

    @Override
    public Double getAverageAge() {
        return null;
    }

    @Override
    public Double getAverageUsingLibraryTime() {
        return null;
    }

    @Override
    public Double getAverageRentsCountByPeriod(LocalDate fromTime, LocalDate toTime) {
        return null;
    }

    @Override
    public Double getAverageAgeByBook(int bookId) {
        return null;
    }

    @Override
    public Double getAverageAgeByAuthor(int authorId) {
        return null;
    }
}