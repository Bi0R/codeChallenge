package com.bairesdev.ClientManager.model.dao;

import com.bairesdev.ClientManager.model.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Integer> {
}
