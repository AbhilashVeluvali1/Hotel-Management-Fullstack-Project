package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.pojo.Users;
import com.hotel.service.CustomerService;

@RestController
@RequestMapping("/user/customer")
public class CustomerController {


	@Autowired
	private CustomerService custService;
	
	
	@GetMapping("/getProfile")
	public ResponseEntity<?> getProfile(@RequestParam("userId") String id) {
		Users u = custService.getProfile(id);
		return ResponseEntity.ok(u);
	}
	
	@PostMapping("/updateProfile")
	public ResponseEntity<?> updateProfile(@RequestBody Users u) {
		Users ur = custService.updateProfile(u);
		return ResponseEntity.ok(ur);
	}
}
