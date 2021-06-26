package org.example.spring_rest_example.service;

import org.example.spring_rest_example.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);
}
