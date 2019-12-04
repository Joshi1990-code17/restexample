package com.JJJ.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JJJ.ProductDto.ProductDto;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping(value = "/get")
	public ProductDto getProduct() {
		System.out.println("i am inside get product");
		ProductDto pd = new ProductDto();
		pd.setId(11);
		pd.setName("CyberTruck");
		pd.setDescription("This is new Tesla's Truck");

		return pd;
	}
}
