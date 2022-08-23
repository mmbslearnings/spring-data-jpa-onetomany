package com.mobile.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.demo.entity.Mobile;


public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
	

}
