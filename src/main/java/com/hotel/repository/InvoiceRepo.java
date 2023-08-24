package com.hotel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hotel.pojo.Invoice;

@Repository
public interface InvoiceRepo extends MongoRepository<Invoice, String>{
	
	public Invoice findByBookingId(String bookingId);
}
