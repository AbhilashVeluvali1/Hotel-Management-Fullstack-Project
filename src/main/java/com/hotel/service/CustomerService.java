package com.hotel.service;

import com.hotel.pojo.Users;

public interface CustomerService {
	public Users getProfile(String userId);
	public Users updateProfile(Users u);
	

}
