package com.online.app.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.app.entity.Product;
import com.online.app.service.ProductService;

@Controller
public class SellerController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/seller")
	public ModelAndView seller(Principal principal) {
		ModelAndView mv = new ModelAndView("seller");
		String userName = principal.getName();
		List<Product> productList = productService.listAllProducts();
		mv.addObject("productList", productList);
		mv.addObject("userName", userName);
		return mv;
	}
	
	@PostMapping("/seller/saveproduct")
	public void saveProduct(@ModelAttribute("product") Product product,HttpServletResponse response, BindingResult result) throws IOException {
		productService.saveProduct(product);
		response.sendRedirect("/seller");
	}
	
}
