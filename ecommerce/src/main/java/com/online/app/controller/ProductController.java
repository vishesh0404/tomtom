package com.online.app.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.app.entity.Product;

@Controller
public class ProductController {
	
	@GetMapping("/seller/addproduct")
	public ModelAndView addProduct(Principal principal) {
		ModelAndView mv = new ModelAndView("addProduct");
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}
}
