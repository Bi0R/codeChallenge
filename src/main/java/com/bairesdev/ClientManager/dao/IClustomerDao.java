package com.bairesdev.ClientManager.dao;

import com.bairesdev.ClientManager.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface IClustomerDao extends CrudRepository<Customer, Integer> {
}
