package com.service.springcloud.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.springcloud.model.Coupan;


@FeignClient(name = "Gateway-Service")

public interface coupanClient {
	@GetMapping("/coupanapi/coupans/{code}")
	  Coupan getCoupan (@PathVariable("code") String code);
	
		
	}
	


