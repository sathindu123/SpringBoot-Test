package org.example.springboot_deploy.ripo;

import org.example.springboot_deploy.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRipo extends JpaRepository<Customer,Integer> {
}
