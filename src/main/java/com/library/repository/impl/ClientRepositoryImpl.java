package com.library.repository.impl;

import com.library.entity.Book;
import com.library.entity.Client;
import com.library.repository.ClientRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ClientRepositoryImpl extends CrudRepositoryImpl<Client, Integer>
        implements ClientRepository {

    @Override
    /** {@inheritDoc} */
    public List<Book> findReadBooks(int clientId) {
        String sql = "SELECT client.readBooks FROM Client client WHERE client.id = ?1";
        TypedQuery<Book> query = getEntityManager().createQuery(sql, Book.class);
        query.setParameter(1, clientId);
        return query.getResultList();
    }

    @Override
    /** {@inheritDoc} */
    public List<Book> findNotReturnedBooks(int clientId) {
        String sql = "SELECT client.readedBooks FROM Client client JOIN client.rents rent "
                + "WHERE rent.returnTime IS NULL AND client.id = ?1";
        TypedQuery<Book> query = getEntityManager().createQuery(sql, Book.class);
        query.setParameter(1, clientId);
        return query.getResultList();
    }

//    @Override
//    /** {@inheritDoc} */
//    TODO Make logic in service tier
//    public Integer getUsingLibraryDays(int clientId) {
//        String sql = "SELECT client.registrationDate FROM Client client WHERE client.id = ?1";
//        TypedQuery<Integer> query = getEntityManager().createQuery(sql, Integer.class);
//        query.setParameter(1, clientId);
//        return query.getSingleResult();
//    }

    @Override
    /** {@inheritDoc} */
    public List<Client> findDebtors() {
        String sql = "SELECT client FROM Client client JOIN FETCH client.rents rent "
                + "WHERE rent.returnTime IS NULL AND rent.borrowingTime IS NOT NULL";
        TypedQuery<Client> query = getEntityManager().createQuery(sql, Client.class);
        return query.getResultList();
    }

//    @Override
//    /** {@inheritDoc} */
//    TODO Make logic in service tier
//    public Double getAverageAge() {
//        "SELECT AVG(client.age) " +
//                "FROM Client client"
//    }

//    @Override
//    /** {@inheritDoc} */
//    TODO Make logic in service tier
//    public Double getAverageUsingLibraryTime() {
//        String sql = "SELECT DATEDIFF(NOW(), client.registrationDate) "
//                + "FROM Client client "
//                + "WHERE client.id = ?1";
//        TypedQuery<Double> query = getEntityManager().createQuery(sql, Double.class);
//        return query.getSingleResult();
//    }

    @Override
    /** {@inheritDoc} */
    public BigDecimal getAverageRentsCountByPeriod(LocalDateTime fromTime, LocalDateTime toTime) {
        String sql = "SELECT AVG(one_client_count) "
                + "FROM client, "
                + "(SELECT count(rent.id) AS one_client_count "
                + "FROM rent, client  "
                + "WHERE rent.user_id = client.id "
                + "AND rent.borrowing_time BETWEEN ?1 AND ?2 "
                + "GROUP BY client.id) AS temp_table";
        Query nativeQuery = getEntityManager().createNativeQuery(sql, BigDecimal.class);
        nativeQuery.setParameter(1, fromTime);
        nativeQuery.setParameter(2, toTime);
        return (BigDecimal) nativeQuery.getSingleResult();
    }

    @Override
    /** {@inheritDoc} */
//    TODO Make logic in service tier
    public List<Client> findByBook(int bookId) {
        String sql = "SELECT client FROM Client client " +
                "JOIN client.readBooks book " +
                "WHERE book.id = ?1";
        TypedQuery<Client> query = getEntityManager().createQuery(sql, Client.class);
        query.setParameter(1, bookId);
        return query.getResultList();
    }

    @Override
    /** {@inheritDoc} */
//    TODO Make logic in service tier
    public List<Client> findByAuthor(int authorId) {
        String sql = "SELECT client FROM Client client " +
                "JOIN client.readBooks book " +
                "JOIN book.mainAuthor author " +
                "WHERE author.id = ?1";
        TypedQuery<Client> query = getEntityManager().createQuery(sql, Client.class);
        query.setParameter(1, authorId);
        return query.getResultList();
    }
}