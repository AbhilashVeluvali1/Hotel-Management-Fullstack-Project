package com.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Payment;
import com.hotel.repository.PaymentRepo;

@Transactional
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepo payment;

	@Override
	public List<Payment> getAllPayment() {
		
		return payment.findAll();
	}

	@Override
	public Payment getPaymentById(String paymentId) {
		return payment.findByPaymentId(paymentId);
	}
	 

}
