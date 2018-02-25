package com.library.repository;

import com.library.entity.Book;
import com.library.entity.Client;

import java.time.LocalDate;
import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Integer> {

    /**
     * Task 3.1. Переглянути статистику по читачу (які книжки брав)
     */
    List<Book> findReadBooks(int clientId);

    /**
     * Task 3.2. Переглянути статистику по читачу (які книжки на руках)
     */
    List<Book> findNotReturnedBooks(int clientId);

    /**
     * Task 3.3. Переглянути статистику по читачу
     * (скільки часу користується послугами бібліотеки)
     */
    Integer getUsingLibraryDays(int clientId);


    /**
     * Task 7. Отримати список читачів-боржників з детальною інформацією
     */
    List<Client> findDebtors();

    /**
     * Task 8.1. Статистика по читачам (середній вік)
     */
    Double getAverageAge();

    /**
     * Task 8.2. Статистика по читачам (середній час користування бібліотекою)
     */
    Double getAverageUsingLibraryTime();

    /**
     * Task 8.3. Статистика по читачам (середня кількість звернень за певний період)
     */
    Double getAverageRentsCountByPeriod(LocalDate fromTime, LocalDate toTime);

    /**
     * Task 9.1. Отримати середній вік читачів по певній книжці
     */
    Double getAverageAgeByBook(int bookId);

    /**
     * Task 9.2. Отримати середній вік читачів по певному автору
     */
    Double getAverageAgeByAuthor(int authorId);
}

