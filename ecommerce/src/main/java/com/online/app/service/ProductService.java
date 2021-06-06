package com.online.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.online.app.entity.Cart;
import com.online.app.entity.Product;
import com.online.app.entity.User;

@Service
public interface ProductService {
	
	List<Product> listAllProducts();
	
	Product getProduct(Long id);
	
	void saveProduct(Product product);
	
	void addToCart(Product product, User user);
	
	Cart getCart(User user);
}
