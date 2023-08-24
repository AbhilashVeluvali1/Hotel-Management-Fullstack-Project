package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.service.HotelService;

@Controller
@RequestMapping("/hotel/modifySearch")
public class HotelSearchController {
	
	@Autowired
	private HotelService hotel;
	
	@GetMapping("/getHotelById/{hotelId}")
	public ResponseEntity<?> getHotelById(@PathVariable("hotelId") String hotelId) {
		return ResponseEntity.ok(hotel.findByHotelId(hotelId));
		
	}
	@GetMapping("/getHotelByName/{hotelName}")
	public ResponseEntity<?> getHotelByName(@PathVariable("hotelName") String name) {
		return ResponseEntity.ok(hotel.findByHotelName(name));
		
	}
	
	@GetMapping("/getHotelByLocation/{city}")
	public ResponseEntity<?> getHotelByLocation(@PathVariable("city") String city) {
		return ResponseEntity.ok(hotel.findByLocation(city));
		
	}
	
	@GetMapping("/getHotelByRating/{rating}")
	public ResponseEntity<?> getHotelByPrice(@PathVariable("rating") double rating) {
		return ResponseEntity.ok(hotel.findByRating(rating));
		
	}
	
	@GetMapping("/getHotelByPrice")
	public ResponseEntity<?> getHotelByPrice(@RequestParam(name = "from") double p1, @RequestParam(name = "to") double p2) {
		return ResponseEntity.ok(hotel.findByPrice(p1, p2));
		
	}
	

}
