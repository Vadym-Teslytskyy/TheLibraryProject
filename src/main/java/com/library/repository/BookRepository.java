package com.library.repository;

import com.library.entity.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    /**
     * Task 1. Подивитись, чи певна книжка доступна
     */
    Boolean getBookAvailability(int bookId);

    /**
     * Task 2.1. Вивести всі книжки по основному автору
     */
    List<Book> findByMainAuthor(int authorId);

    /**
     * Task 2.2. Вивести всі книжки по співавтору
     */
    List<Book> findByCoAuthor(int authorId);

    /**
     * Task 4.1. Скільки книжок в бібліотеці, які видані в період незалежності
     */
    Long getAmountReleasedDuringIndependence();

    /**
     * Task 4.2. Показати книги, які видані в період незалежності
     */
    List<Book> findReleasedDuringIndependence();

    /**
     * Task 5.1. Скільки разів брали певну книжку в загальному
     */
    Long getRentCount(int bookId);

    /**
     * Task 5.2. Скільки разів брали певну книжку по примірникам
     * (Скільки окремих примірників брали?)
     */
    Long getCopiesRentCount(int bookId);

    /**
     * Task 5.3. Скільки разів брали певну книжку (середній час читання)
     */
    Double averageReadingTime(int bookId);

    /**
     * Task 6.1. Отримати найпопулярніші книжки за період
     */
    List<Book> findBestByPeriod(LocalDate fromTime, LocalDate toTime, int resultListSize);

    /**
     * Task 6.2. Отримати найнепопулярніші книжки за період
     */
    List<Book> findWorstByPeriod(LocalDate fromTime, LocalDate toTime, int resultListSize);

    /**
     * Task 10. Вивести по назві книжки
     * кількість екземплярів з інформацією про них (наявна, на руках)
     */
    Book getCopiesInfo(String bookName);
    // TODO Тут потрібно повертати не Book, а щось типу BookAvailabilityView, котррий містить bookName, generalCount, availableCount
}
