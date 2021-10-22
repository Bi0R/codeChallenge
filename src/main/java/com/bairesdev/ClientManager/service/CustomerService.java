package com.bairesdev.ClientManager.service;

import com.bairesdev.ClientManager.dao.IClustomerDao;
import com.bairesdev.ClientManager.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private IClustomerDao customerDao;

    /**
     * Method to get all the Customers
     * @return
     */
    public List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
        customerDao.findAll().forEach(customer->customers.add(customer));
        return customers;
    }

    /**
     * Method to get the customer by Id
     * @return
     */
    public Optional<Customer> getCustomerById(Integer id) {
        return customerDao.findById(id);
    }

    /**
     * Method to insert/update customer
     * @return
     */
    public Customer saveOrUpdateCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    /**
     * Method to delete customer
     * @return
     */
    public Customer deleteCustomerById(Integer id) {
        Optional<Customer> toBeDeleted = getCustomerById(id);
        if(toBeDeleted.isPresent()) {
            customerDao.delete(toBeDeleted.get());
        }
        return toBeDeleted.get();
    }
}
