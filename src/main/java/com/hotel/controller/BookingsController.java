package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.pojo.Bookings;
import com.hotel.service.BookingService;

@RestController
@RequestMapping("/user/customer/manageBokings")
public class BookingsController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/getBookingHistory")
	public ResponseEntity<?> getBookingHistory(@RequestParam("custId") String id){
		
		return ResponseEntity.ok(bookingService.getBookingHistory(id));
	}
	
	@GetMapping("/getBookingByDate")
	public ResponseEntity<?> getBookingByDate(@RequestParam("date") String date) {
		return ResponseEntity.ok(bookingService.getBookingByDate(date));
	}
	
	@PostMapping("/updateBookingById")
	public ResponseEntity<?> updateBookingById(@RequestBody Bookings b){
		Bookings b1 = bookingService.updateBookingById(b);
		return ResponseEntity.ok(b1);
		
	}
	@GetMapping("/getBookingById")
	public ResponseEntity<?> getBookingById(@RequestParam("bookingId") String bookingId){
		return ResponseEntity.ok(bookingService.getBookingByid(bookingId));
	}
	
	@GetMapping("/cancelBookingById") 
	public ResponseEntity<?> cancelBookingById(@RequestParam("bookingId") String bookingId, @RequestParam("status") int status){
		return ResponseEntity.ok(bookingService.cancelBookingById(bookingId, status));
	}
	@GetMapping("/getAllBookingsByHotelId")
	public ResponseEntity<?> getAllBookingsByHotelId(@RequestParam("hotelId") String hotelId) {
		
		return ResponseEntity.ok(bookingService.getAllBookingsByHotel(hotelId));
	}
	@GetMapping("/getAllBookingsByHotel/{mgrId}")
	public ResponseEntity<?> getAllBookingsByHotel(@PathVariable("mgrId") String mgrId) {
		return ResponseEntity.ok(bookingService.getAllBookingById(mgrId));
	}
	@GetMapping("/getInvoiceById/{bookingId}")
	public ResponseEntity<?> getInvoiceById(@PathVariable("bookingId") String bookingId) {
		return ResponseEntity.ok(bookingService.getInvoiceById(bookingId));
	}
	
}
