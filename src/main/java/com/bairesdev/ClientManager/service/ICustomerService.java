package com.bairesdev.ClientManager.service;

import com.bairesdev.ClientManager.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public List<Customer> getCustomer();
    public Optional<Customer> getCustomerById(Integer id);
    public Customer saveOrUpdateCustomer(Customer customer);
    public Customer deleteCustomerById(Integer id);
}
