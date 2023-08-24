package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Users;
import com.hotel.repository.UsersRepo;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private UsersRepo userRepo;
	
	@Override
	public Users getProfile(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findByUserId(userId);
		
	}

	@Override
	public Users updateProfile(Users u) {
		// TODO Auto-generated method stub
		
		return userRepo.save(u);
	}

}
