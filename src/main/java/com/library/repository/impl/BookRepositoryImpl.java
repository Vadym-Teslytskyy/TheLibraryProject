package com.library.repository.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class BookRepositoryImpl extends CrudRepositoryImpl<Book, Integer>
        implements BookRepository {

    @Override
    public Boolean getBookAvailability(int bookId) {
        return null;
    }

    @Override
    public List<Book> findByMainAuthor(int authorId) {
        return null;
    }

    @Override
    public List<Book> findByCoAuthor(int authorId) {
        return null;
    }

    @Override
    public Long getAmountReleasedDuringIndependence() {
        return null;
    }

    @Override
    public List<Book> findReleasedDuringIndependence() {
        return null;
    }

    @Override
    public Long getRentCount(int bookId) {
        return null;
    }

    @Override
    public Long getCopiesRentCount(int bookId) {
        return null;
    }

    @Override
    public Double averageReadingTime(int bookId) {
        return null;
    }

    @Override
    public List<Book> findBestByPeriod(LocalDate fromTime, LocalDate toTime, int resultListSize) {
        return null;
    }

    @Override
    public List<Book> findWorstByPeriod(LocalDate fromTime, LocalDate toTime, int resultListSize) {
        return null;
    }

    @Override
    public Book getCopiesInfo(String bookName) {
        return null;
    }
}