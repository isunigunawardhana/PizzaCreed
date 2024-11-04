package com.isuni.pizzacreed.repository;

import com.isuni.pizzacreed.dao.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasket, Long> {

}
