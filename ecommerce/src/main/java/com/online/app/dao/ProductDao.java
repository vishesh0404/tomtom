package com.online.app.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.online.app.entity.Cart;
import com.online.app.entity.CartItems;
import com.online.app.entity.Product;
import com.online.app.entity.User;

@Component
public interface ProductDao {

	List<Product> listAllProducts();
	
	void saveProduct(Product product);
	
	Cart findCartByUserId(User user);
	
	void saveCart(Cart cart);
	
	CartItems saveCartItems(CartItems items);
	
	Product getProduct(Long id);
	
	CartItems getCartItems(Long id);
}
