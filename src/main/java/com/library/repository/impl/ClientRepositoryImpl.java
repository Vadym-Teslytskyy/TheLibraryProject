package com.library.repository.impl;

import com.library.entity.Client;
import com.library.repository.ClientRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl extends CrudRepositoryImpl<Client, Integer>
        implements ClientRepository {

}