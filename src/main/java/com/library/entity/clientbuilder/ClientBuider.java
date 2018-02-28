package com.library.entity.clientbuilder;

import com.library.entity.Client;

public abstract class ClientBuider {

    protected Client client;

    Client clientBuider() {
        return client;
    }

    public void createNewClient() {
        client = new Client();
    }

    public Client getClient(){
        return client;
    }

    public abstract void buildRegisteredClient();

}
