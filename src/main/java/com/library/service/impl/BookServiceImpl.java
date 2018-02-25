package com.library.service.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl extends CrudServiceImpl<Book, Integer, BookRepository> implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookRepository getRepository() {
        return bookRepository;
    }

    @Override
    public Boolean getBookAvailability(int bookId) {
        Book book = bookRepository.findAvailableBookById(bookId);
        return (book != null) ? true : false;
    }

    @Override
    public List<Book> findByMainAuthor(int authorId) {
        return null;
    }

    @Override
    public List<Book> findByCoAuthor(int coAuthorId) {
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
    public List<Book> findBestBooksByPeriod(LocalDateTime startDate, int resultListSize) {
        return null;
    }

    @Override
    public List<Book> findWorstBooksByPeriod(LocalDateTime startDate, int resultListSize) {
        return null;
    }

    @Override
    public List<Long> findBestCountOfRentByPeriod(LocalDateTime startDate, int resultListSize) {
        return null;
    }

    @Override
    public List<Long> findWorstCountOfRentByPeriod(LocalDateTime startDate, int resultListSize) {
        return null;
    }

    @Override
    public Book findBookByName(String bookName) {
        return null;
    }
}
