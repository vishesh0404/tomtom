package com.online.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.app.entity.CartItems;

public interface CartItemsRepository extends JpaRepository<CartItems, Long>{

}
