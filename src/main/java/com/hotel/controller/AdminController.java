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

import com.hotel.service.HotelService;
import com.hotel.service.PaymentService;
import com.hotel.service.UserService;

@Controller
@RequestMapping("/user")
public class AdminController {
	
	@Autowired
	UserService usr;
	@Autowired 
	PaymentService payment;
	@Autowired
	HotelService hotel;
	
	@GetMapping("/admin/getAllUsers")
	public ResponseEntity<?> getBookingHistory(){
		return ResponseEntity.ok(usr.findAllUsers());
	}
	
	@GetMapping("/payment/getAllPayments") 
	public ResponseEntity<?> getAllPayments() {
		return ResponseEntity.ok(payment.getAllPayment());
	}
	
	@GetMapping("/payment/getPaymentById/{paymentId}") 
	public ResponseEntity<?> getPaymentById(@PathVariable("paymentId") String paymentId) {
		return ResponseEntity.ok(payment.getPaymentById(paymentId));
	}
	
	@PostMapping("/admin/deleteCustomer") 
	public ResponseEntity<?> deleteCustomer(@RequestBody String custId) {
		return ResponseEntity.ok(usr.deleteCustomer(custId));
	}
	
	@PostMapping("/admin/deleteHotel") 
	public ResponseEntity<?> deleteHotel(@RequestBody String hotelId) {
		return ResponseEntity.ok(hotel.deleteCustomer(hotelId));
	}
	
	
	
	
	
}
