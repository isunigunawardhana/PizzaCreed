package com.isuni.pizzacreed.repository;

import com.isuni.pizzacreed.dao.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketItemRepository extends JpaRepository<BasketItem, Long> {

    void deleteAllByShoppingBasketId(Long basketId);
}
