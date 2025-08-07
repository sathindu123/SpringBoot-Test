package org.example.springboot_deploy.service.impl;

import org.example.springboot_deploy.Entity.Customer;
import org.example.springboot_deploy.ripo.CustomerRipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
    @Autowired
    private CustomerRipo customerRepo;

    public List<Customer> getCustomer() {

        return customerRepo.findAll();
    }
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }

}
