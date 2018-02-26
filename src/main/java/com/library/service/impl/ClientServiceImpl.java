package com.library.service.impl;

import com.library.entity.Book;
import com.library.entity.Client;
import com.library.repository.ClientRepository;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ClientServiceImpl extends CrudServiceImpl <Client, Integer, ClientRepository> implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public ClientRepository getRepository() {
        return clientRepository;
    }

    @Override
    public List<Book> findReadBooks(int clientId) {
        return getRepository().findReadBooks(clientId);
    }

    @Override
    public List<Book> findNotReturnedBooks(int clientId) {
        return getRepository().findNotReturnedBooks(clientId);
    }

    @Override
    public Long getUsingLibraryDaysCount(int clientId) {
        Client client = getRepository().find(clientId);
        LocalDate registrationDate = client.getRegistrationDate();
        return registrationDate.until(LocalDate.now(), ChronoUnit.DAYS);
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
    public BigDecimal getAverageRentsCountByPeriod(LocalDateTime fromTime, LocalDateTime toTime) {
        return null;
    }

    @Override
    public List<Client> findByBook(int bookId) {
        return null;
    }

    @Override
    public List<Client> findByAuthor(int authorId) {
        return null;
    }
}
