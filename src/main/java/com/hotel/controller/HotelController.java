package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.service.HotelService;
import com.hotel.service.HotelServiceImpl;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotel;
	
	
	@GetMapping
	public ResponseEntity<?> hotels() {
		return ResponseEntity.ok(hotel.findAllHotels());
	}
	
	@GetMapping("/getAvailability/{hotelId}")
	public ResponseEntity<?> getAvailability(@PathVariable("hotelId") String hotelId) {
		return ResponseEntity.ok(hotel.getAvailability(hotelId));
	}
	

}
