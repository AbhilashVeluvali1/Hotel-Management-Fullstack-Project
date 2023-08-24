package com.hotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.pojo.Hotels;
import com.hotel.service.ManagerService;

@Controller
@RequestMapping("user/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService mgrService;
	
	@GetMapping("/getHotel/{mgrId}")
	public ResponseEntity<?> getHotel(@PathVariable("mgrId") String mgrId) {
		return ResponseEntity.ok(mgrService.getHotel(mgrId));
		
	}
	@PostMapping("/updateHotelById")
	public ResponseEntity<?> updateHoetlById(@RequestBody Hotels h) {
		Hotels h1 = mgrService.updateHotelById(h);
		return ResponseEntity.ok(h1);
	}
	
	
	

}
