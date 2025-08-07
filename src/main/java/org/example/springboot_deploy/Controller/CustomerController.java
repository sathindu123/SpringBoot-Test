package org.example.springboot_deploy.Controller;

import org.example.springboot_deploy.Entity.Customer;
import org.example.springboot_deploy.service.CustomerService;
import org.example.springboot_deploy.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;
    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

}
