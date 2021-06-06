package com.online.app.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.app.dao.ProductDao;
import com.online.app.entity.Cart;
import com.online.app.entity.CartItems;
import com.online.app.entity.Product;
import com.online.app.entity.User;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> listAllProducts() {
		return productDao.listAllProducts();
	}

	@Override
	public void saveProduct(Product product) {
		product.setId(0L);
		productDao.saveProduct(product);
	}

	@Override
	public void addToCart(Product product, User user) {
		Cart cart = getCart(user);
		Set<CartItems> cartItems = cart.getCartItems();
		boolean ifAlreadyExists = false;
		float itemAmount = 0F;
		for(CartItems item : cartItems) {
			if(item.getProduct().getId().equals(product.getId())) {
				item.setQuantity(item.getQuantity()+1);
				itemAmount = product.getPrice();
				cart.setTotalAmount(cart.getTotalAmount()+itemAmount);
				ifAlreadyExists = true;
				break;
			}
		}
		if(!ifAlreadyExists) {
			CartItems cartItem = new CartItems(0L, cart, product, 1);
			cartItem = productDao.saveCartItems(cartItem);
			cartItems.add(cartItem);
			itemAmount = product.getPrice();
			cart.setTotalAmount(cart.getTotalAmount()+itemAmount);
		}
		cart.setCartItems(cartItems);
		cart.setTotalItems(cart.getTotalItems()+1);
		productDao.saveCart(cart);
	}
	
	@Override
	public Cart getCart(User user) {
		return productDao.findCartByUserId(user);
	}

	@Override
	public Product getProduct(Long id) {
		return productDao.getProduct(id);
	}

	
}
