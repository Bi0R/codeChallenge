package com.bairesdev.ClustomerManager.controller;

import com.bairesdev.ClustomerManager.entity.Customer;
import com.bairesdev.ClustomerManager.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    //creating a get mapping that retrieves the detail of all clients
    @GetMapping()
    public List<Customer> getTasks() {
        return customerService.getCustomer();
    }

    //creating a get mapping that retrieves the detail of a specific client
    @GetMapping("/{id}")
    private Customer getStudent(@PathVariable("id") Integer id) {
        return customerService.getCustomerById(id).get();
    }

    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        customerService.deleteCustomerById(id);
    }
    //creating post mapping that post the student detail in the database
    @PostMapping()
    private Customer saveStudent(@RequestBody Customer customer) {
        customerService.saveOrUpdateCustomer(customer);
        return customer;
    }
}
