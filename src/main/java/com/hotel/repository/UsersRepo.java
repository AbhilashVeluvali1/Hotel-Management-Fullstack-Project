package com.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.pojo.Users;

public interface UsersRepo extends MongoRepository<Users, String> {
	
	public Users findByEmailAndPassword(String email, String passowrd);
	public Users findByEmail(String email);
	public Users findByUserId(String userId);
	
	

}
