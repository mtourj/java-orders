package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findAgentById(long id);

    Customer findAgentByName(String name);

    void delete(long id);

    Customer save(Customer agent);

    Customer update(Customer agent, long id);
}
