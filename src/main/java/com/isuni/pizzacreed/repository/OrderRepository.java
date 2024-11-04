package com.isuni.pizzacreed.repository;

import com.isuni.pizzacreed.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}