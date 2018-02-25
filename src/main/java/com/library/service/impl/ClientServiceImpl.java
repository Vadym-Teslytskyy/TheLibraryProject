package com.library.service.impl;

import com.library.entity.Client;
import com.library.repository.ClientRepository;
import com.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends CrudServiceImpl <Client, Integer, ClientRepository> implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public ClientRepository getRepository() {
        return clientRepository;
    }
}
