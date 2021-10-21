package com.bairesdev.ClientManager.model.service;

import com.bairesdev.ClientManager.model.entity.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    public List<Client> getClient();
    public Optional<Client> getClientById(Integer id);
    public Client saveOrUpdateClient(Client client);
    public Client deleteClientById(Integer id);
}
