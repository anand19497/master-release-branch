package com.service.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.service.springcloud.model.Coupan;
import com.service.springcloud.repos.CoupanRepo;

@RestController
@RequestMapping("/coupanapi")
public class CoupanRestController {

    @Autowired
    private CoupanRepo repo;

    @PostMapping("/coupans")
    public Coupan create(@RequestBody Coupan coup) {
    	System.out.println("server 2 ");
        return repo.save(coup);
    }

   
	@GetMapping("/coupans/{code}")
    public  Coupan getCoupan(@PathVariable("code") String code) {
		System.out.println("serve 2 ");
        return repo.findBycode(code);
    }
}
