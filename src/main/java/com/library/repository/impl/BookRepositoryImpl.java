package com.library.repository.impl;

import com.library.entity.Book;
import com.library.entity.BookCopy;
import com.library.entity.Rent;
import com.library.model.filter.BookFilter;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl extends CrudRepositoryImpl<Book, Integer>
        implements BookRepository {

    private static final LocalDate INDEPENDENCE_DAY_DATE = LocalDate.of(1991, Month.AUGUST, 24);

    @Override
    public Book findAvailableBookById(int bookId) {
        String sqlQuery = "SELECT b from Book b WHERE (b.id = ?1 and b.availableCount > 0)";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter(1, bookId);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> findByMainAuthor(int authorId) {
        String sqlQuery = "SELECT b FROM Book b JOIN b.mainAuthor a WHERE a.id = ?1";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter(1, authorId);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> findByCoAuthor(int coAuthorId) {
        String sqlQuery = "SELECT DISTINCT b.name FROM Book b JOIN b.collaborationAuthors a WHERE a.id = ?1";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter(1, coAuthorId);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long findReleasedDuringIndependence() {
        String sqlQuery = "SELECT COUNT(b.id) FROM Book b"
                + " WHERE b.releaseDate BETWEEN :startDate AND :endDate";
        TypedQuery<Long> query = getEntityManager().createQuery(sqlQuery, Long.class);
        query.setParameter("startDate", INDEPENDENCE_DAY_DATE);
        query.setParameter("endDate", LocalDate.now());
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long getRentCount(int bookId) {
        String sqlQuery = "SELECT COUNT(r.copyOfBook.id) FROM Rent r JOIN r.copyOfBook c JOIN c.book b WHERE b.id = ?1";
        TypedQuery<Long> query = getEntityManager().createQuery(sqlQuery, Long.class);
        query.setParameter(1, bookId);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long getCopiesRentCount(int bookId) {
        String sqlQuery = "SELECT COUNT(c.id) FROM Rent r JOIN r.copyOfBook c JOIN c.book b"
                + " WHERE b.id = ?1 GROUP BY b.id";
        TypedQuery<Long> query = getEntityManager().createQuery(sqlQuery, Long.class);
        query.setParameter(1, bookId);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double averageReadingTime(int bookId) {
//        TODO check this query for exeption
        String sqlQuery = "SELECT AVG (DATEDIFF(r.returnTime, r.borrowingTime)) FROM Rent r"
                + " JOIN r.copyOfBook c JOIN c.book b WHERE b.id = ?1 AND r.returnTime IS NOT NULL";
        TypedQuery<Double> query = getEntityManager().createQuery(sqlQuery, Double.class);
        query.setParameter(1, bookId);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Long> findBestCountOfRentByPeriod(LocalDateTime startDate, int resultListSize) {
        String sqlQuery = "SELECT COUNT(r.id) FROM Rent r JOIN r.copyOfBook c JOIN c.book b"
                + " WHERE r.borrowingTime BETWEEN :startDate AND :endDate GROUP BY b.id ORDER BY COUNT(r.id) DESC";
        TypedQuery<Long> query = getEntityManager().createQuery(sqlQuery, Long.class);
        query.setParameter("startDate", startDate)
                .setParameter("endDate", LocalDateTime.now())
                .setMaxResults(resultListSize);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Long> findWorstCountOfRentByPeriod(LocalDateTime startDate, int resultListSize) {
        String sqlQuery = "SELECT COUNT(r.id) FROM Rent r JOIN r.copyOfBook c JOIN c.book b"
                + " WHERE r.borrowingTime BETWEEN :startDate AND :endDate GROUP BY b.id ORDER BY COUNT(r.id) ASC";
        TypedQuery<Long> query = getEntityManager().createQuery(sqlQuery, Long.class);
        query.setParameter("startDate", startDate)
                .setParameter("endDate", LocalDateTime.now())
                .setMaxResults(resultListSize);
        return query.getResultList();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Book findBookByName(String bookName) {
        String sqlQuery = "SELECT book FROM Book book WHERE book.name = ?1";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter(1, bookName);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> findBestBooksByPeriod(LocalDateTime startDate, int resultListSize) {
        String sqlQuery = "SELECT b FROM Rent r JOIN r.copyOfBook c JOIN c.book b"
                + " WHERE r.borrowingTime BETWEEN :startDate AND :endDate GROUP BY b.id ORDER BY COUNT(r.id) DESC";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter("startDate", startDate)
                .setParameter("endDate", LocalDateTime.now())
                .setMaxResults(resultListSize);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> findWorstBooksByPeriod(LocalDateTime startDate, int resultListSize) {
        String sqlQuery = "SELECT b FROM Rent r JOIN r.copyOfBook c JOIN c.book b"
                + " WHERE r.borrowingTime BETWEEN :startDate AND :endDate GROUP BY b.id ORDER BY COUNT(r.id) ASC";
        TypedQuery<Book> query = getEntityManager().createQuery(sqlQuery, Book.class);
        query.setParameter("startDate", startDate)
                .setParameter("endDate", LocalDateTime.now())
                .setMaxResults(resultListSize);
        return query.getResultList();
    }

    @Override
    public List<Book> findBooksByFilter(BookFilter filter) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);

        Root<Rent> root = criteriaQuery.from(Rent.class);

        Join<Rent, BookCopy> copyJoin = root.join("copyOfBook");

        Join<BookCopy, Book> bookJoin = copyJoin.join("book");

        criteriaQuery.select(bookJoin);

        criteriaQuery.groupBy(bookJoin.get("id"));

        String period = filter.getPeriod();

        List<Predicate> predicates = new ArrayList<>();

        if (filter.getBookFamous() != null) {
            if (filter.getBookFamous().equals("best")) {
                criteriaQuery.orderBy(criteriaBuilder.desc(criteriaBuilder.count(root.get("id"))));
                bookPeriodCheckPredicateMaking(criteriaBuilder, root, period, predicates);
            }
            if (filter.getBookFamous().equals("worst")) {
                criteriaQuery.orderBy(criteriaBuilder.asc(criteriaBuilder.count(root.get("id"))));
                bookPeriodCheckPredicateMaking(criteriaBuilder, root, period, predicates);
            }
        }
        if (filter.getBookName() != null){
            predicates.add(
                    criteriaBuilder.and(criteriaBuilder.like(bookJoin.get("name"), filter.getBookName() + "%")));
        }else {

        }
        criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));
        List<Book> resultList = getEntityManager().createQuery(criteriaQuery).getResultList();
        return resultList;
    }

    private void bookPeriodCheckPredicateMaking(CriteriaBuilder criteriaBuilder, Root root, String period, List<Predicate> predicates) {
        if (period.equals("week")) {
            predicates.add(criteriaBuilder.and(
                    criteriaBuilder.greaterThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now().minusWeeks(1)),
                    criteriaBuilder.lessThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now())));
        }
        if (period.equals("month")) {
            predicates.add(criteriaBuilder.and(
                    criteriaBuilder.greaterThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now().minusMonths(1)),
                    criteriaBuilder.lessThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now())));
        }
        if (period.equals("year")) {
            predicates.add(criteriaBuilder.and(
                    criteriaBuilder.greaterThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now().minusYears(1)),
                    criteriaBuilder.lessThanOrEqualTo(root.get("borrowingTime"), LocalDateTime.now())));
        }
    }
}