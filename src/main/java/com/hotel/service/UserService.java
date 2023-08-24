package com.hotel.service;

import java.util.List;

import com.hotel.pojo.Users;

public interface UserService {
	public String loginAUTH(String email, String password);
	public String signUp(Users user);
	public boolean existingUser(String email);
	public List<Users> findAllUsers();
	public String deleteCustomer(String custId);
}
