package com.service.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.springcloud.model.Coupan;


public interface CoupanRepo extends JpaRepository<Coupan, Long> {

	Coupan findBycode(String code);

	

}
