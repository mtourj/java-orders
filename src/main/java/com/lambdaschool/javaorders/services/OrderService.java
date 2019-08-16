package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    Order findAgentById(long id);

    Order findAgentByName(String name);

    void delete(long id);

    Order save(Order agent);

    Order update(Order agent, long id);
}
