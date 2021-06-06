package com.online.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.app.entity.Cart;
import com.online.app.entity.CartItems;
import com.online.app.entity.Product;
import com.online.app.entity.User;
import com.online.app.repo.CartItemsRepository;
import com.online.app.repo.CartRepository;
import com.online.app.repo.ProductRepository;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	ProductRepository repo;
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	CartItemsRepository cartItemRepo;

	@Override
	public List<Product> listAllProducts() {
		List<Product> prodList = new ArrayList<Product>();
		prodList = repo.findAll();
		return prodList;
	}

	@Override
	public void saveProduct(Product product) {
		repo.save(product);
	}

	@Override
	public Cart findCartByUserId(User user) {
		return cartRepo.findCartByUserId(user.getUserId());
	}

	@Override
	public void saveCart(Cart cart) {
		cartRepo.save(cart);
		
	}

	@Override
	public Product getProduct(Long id) {
		Optional<Product> product = repo.findById(id);
		return product.get();
	}

	@Override
	public CartItems saveCartItems(CartItems items) {
		items = cartItemRepo.save(items);
		return items;
	}

	@Override
	public CartItems getCartItems(Long id) {
		Optional<CartItems> cartItems = cartItemRepo.findById(id);
		return cartItems.get();
	}
	
}
