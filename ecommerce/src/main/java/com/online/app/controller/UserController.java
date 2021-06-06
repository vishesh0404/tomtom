package com.online.app.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.app.entity.Cart;
import com.online.app.entity.CartItems;
import com.online.app.entity.Product;
import com.online.app.entity.User;
import com.online.app.service.LoginService;
import com.online.app.service.ProductService;


@Controller
public class UserController {

	@Autowired
	ProductService productService;
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/user")
	public ModelAndView user(Principal principal) {
		ModelAndView mv = new ModelAndView("user");
		String userName = principal.getName();
		List<Product> productList = productService.listAllProducts();
		User user = loginService.getUser(userName);
		Cart cart = productService.getCart(user);
		mv.addObject("productList", productList);
		mv.addObject("userName", userName);
		mv.addObject("cart", cart);
		return mv;
	}
	
	@PostMapping("/user/addtocart/{id}")
	public void addToCart(@PathVariable("id")final String id, Principal principal,HttpServletResponse response) throws IOException {
		User user = loginService.getUser(principal.getName());
		Product product = productService.getProduct(Long.valueOf(id));
		productService.addToCart(product, user);
		response.sendRedirect("/user");
	}
	
	@GetMapping("/user/cart")
	public ModelAndView getCart(Principal principal) {
		ModelAndView mv = new ModelAndView("cart");
		String userName = principal.getName();
		User user = loginService.getUser(userName);
		Cart cart = productService.getCart(user);
		Set<CartItems> cartItems = cart.getCartItems();
		mv.addObject("userName", userName);
		mv.addObject("cart", cart);
		mv.addObject("cartItems", cartItems);
		return mv;
	}
	
	@GetMapping("/user/checkout")
	public ModelAndView checkout(Principal principal) {
		ModelAndView mv = new ModelAndView("checkout");
		String userName = principal.getName();
		User user = loginService.getUser(userName);
		Cart cart = productService.getCart(user);
		Set<CartItems> cartItems = cart.getCartItems();
		mv.addObject("userName", userName);
		mv.addObject("cart", cart);
		mv.addObject("cartItems", cartItems);
		return mv;
	}
}
