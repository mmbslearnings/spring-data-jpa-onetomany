package com.mobile.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.demo.entity.Mobile;
import com.mobile.demo.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	@PostMapping("/add")
	public String addMobile(@RequestBody Mobile mobile) {
		mobileService.addMobile(mobile);
		return "Mobile Saved";
	}
	
	@GetMapping("/getMobile/{mobileid}")
	public Mobile getMobile(@PathVariable(name = "mobileid") int id) {
		return mobileService.getMobile(id).get();
	}

}
