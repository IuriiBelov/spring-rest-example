package org.example.spring_rest_example.repository;

import org.example.spring_rest_example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
