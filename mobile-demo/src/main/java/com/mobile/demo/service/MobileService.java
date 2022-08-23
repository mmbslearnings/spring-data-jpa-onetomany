package com.mobile.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.demo.entity.Mobile;
import com.mobile.demo.repository.MobileRepository;

@Service
public class MobileService {
	
	@Autowired
	MobileRepository mobileRepository;
	
	public Mobile addMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}
	
	public  Optional<Mobile> getMobile(int id) {
		System.out.println("Inside Find MEthod");
		return mobileRepository.findById(id);
	}
	
	public List<Mobile> getAllMobiles(){
		return mobileRepository.findAll();
	}

}
