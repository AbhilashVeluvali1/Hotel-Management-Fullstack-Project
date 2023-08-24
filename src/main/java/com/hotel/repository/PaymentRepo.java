package com.hotel.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hotel.pojo.Payment;

@Repository
public interface PaymentRepo extends MongoRepository<Payment, String> {

	public Payment findByPaymentId(String paymentId);
	
}
