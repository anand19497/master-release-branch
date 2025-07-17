package com.service.springcloud.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.springcloud.model.product;

public interface ProductRepo extends JpaRepository<product,Long> {

	product getValueByName(String name);

}
