package com.bairesdev.ClientManager.model.service;

import com.bairesdev.ClientManager.model.dao.IClientDao;
import com.bairesdev.ClientManager.model.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService{

    @Autowired
    private IClientDao clientDao;

    /**
     * Method to get all the clients
     * @return
     */
    public List<Client> getClient() {
        return (List<Client>) clientDao.findAll();
    }

    /**
     * Method to get the client by Id
     * @return
     */
    public Optional<Client> getClientById(Integer id) {
        return clientDao.findById(id);
    }

    /**
     * Method to insert/update client
     * @return
     */
    public Client saveOrUpdateClient(Client client) {
        return clientDao.save(client);
    }

    /**
     * Method to delete client
     * @return
     */
    public Client deleteClientById(Integer id) {
        Optional<Client> toBeDeleted = getClientById(id);
        if(toBeDeleted.isPresent()) {
            clientDao.delete(toBeDeleted.get());
        }
        return toBeDeleted.get();
    }
}
