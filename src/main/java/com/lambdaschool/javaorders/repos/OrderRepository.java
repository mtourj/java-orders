package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
