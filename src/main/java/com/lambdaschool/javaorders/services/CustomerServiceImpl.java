package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    @Override
    public List<Customer> findAll() {
        List<Customer> list = new ArrayList<>();

        customerRepo.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @Override
    public Customer findAgentById(long id) {
        return null;
    }

    @Override
    public Customer findAgentByName(String name) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Customer save(Customer agent) {
        return null;
    }

    @Override
    public Customer update(Customer agent, long id) {
        return null;
    }
}
