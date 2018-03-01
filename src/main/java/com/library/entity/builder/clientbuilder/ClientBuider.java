package com.library.entity.builder.clientbuilder;

import com.library.entity.builder.ClassBuider;
import com.library.entity.Client;

public abstract class ClientBuider implements ClassBuider<Client> {

    protected Client client;

    public void createNewClient() {
        client = new Client();
    }

}
