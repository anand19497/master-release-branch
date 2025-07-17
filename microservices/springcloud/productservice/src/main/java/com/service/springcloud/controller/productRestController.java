package com.service.springcloud.controller;

import com.service.springcloud.restclients.coupanClient;

import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.springcloud.model.Coupan;
import com.service.springcloud.model.product;
import com.service.springcloud.model.repos.ProductRepo;
//import com.service.springcloud.restclients.coupanClient;

@RestController
@RequestMapping("/productapi")
@RefreshScope
public class productRestController {
	@Autowired
	 private ProductRepo repo;
	@Autowired
	 private coupanClient coupanClient;
	@Value("${com.anand.springcloud.prop}")
	private String prop;
	
	@GetMapping("/prop")
	public String getProp() {
		return this.prop;
	}
	@PostMapping("/products")
	@Retry(name="product-api",fallbackMethod ="productErrorService")
public product productcreate(@RequestBody product prod ) {	
	Coupan coupan=	coupanClient.getCoupan(prod.getCoupanCode());
	prod.setPrice(prod.getPrice().subtract(coupan.getDiscount()));
		return repo.save(prod);
	}
	@GetMapping("/products/{name}")
	public product productGet(@PathVariable("name") String name) {
		return repo.getValueByName(name);
	}
	
	@GetMapping("/products/id/{id}")
	public product getProductById(@PathVariable("id") Long id) {
	    return repo.findById(id)
	               .orElseThrow();
	}
	
	public product productErrorService( product prod, Exception exception ) {
		System.out.println("Error Happend in Product service");
		return prod;
		
	}
}
