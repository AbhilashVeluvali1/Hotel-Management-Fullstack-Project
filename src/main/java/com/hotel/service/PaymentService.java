package com.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hotel.pojo.Payment;


public interface PaymentService {
	public List<Payment> getAllPayment();

	public Payment getPaymentById(String paymentId);

	

}
