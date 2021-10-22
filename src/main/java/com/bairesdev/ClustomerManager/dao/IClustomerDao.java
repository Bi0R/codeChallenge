package com.bairesdev.ClustomerManager.dao;

import com.bairesdev.ClustomerManager.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface IClustomerDao extends CrudRepository<Customer, Integer> {
}
