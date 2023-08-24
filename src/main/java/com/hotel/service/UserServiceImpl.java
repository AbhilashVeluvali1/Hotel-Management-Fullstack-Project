package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Bookings;
import com.hotel.pojo.Users;
import com.hotel.repository.UsersRepo;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UsersRepo user; 

	@Override
	public String loginAUTH(String email, String password) {
		Users u = user.findByEmailAndPassword(email, password);
		if(u!=null) {
			return u.getUserId();
		}
		else {
			return "Invalid Credentials. Please try again";
		}
	}

	@Override
	public String signUp(Users user) {
		Users u = this.user.insert(user);
		if(u!=null) {
			return "Registered Sucessfully";
		}
		else {
			return "Please try again";
		}
	}

	@Override
	public boolean existingUser(String email) {
		 Users u = user.findByEmail(email);
		 if(u!=null) 
			 return true;
		 else 
			 return false;
	}

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return user.findAll();
	}

	@Override
	public String deleteCustomer(String custId) {
		Users u = new Users();
		u = user.findByUserId(custId);
		if(u.getIsDeleted()==0)
		{
			u.setIsDeleted(1);
			Users u1 = user.save(u);
			if(u1!=null) {
				return "Deleted sucessfully";
		}	
		}
		return "Please try again!";
	}

}
