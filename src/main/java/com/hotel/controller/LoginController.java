package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.DTO.SignInDTO;
import com.hotel.pojo.Users;
import com.hotel.service.UserService;

@RestController
@RequestMapping("/hotel")
public class LoginController {
	
	@Autowired
	private UserService user;
	
	@PostMapping("/signIn")
	public ResponseEntity<?> signIn(@RequestBody SignInDTO signInDetails) {
		String res = user.loginAUTH(signInDetails.getUserName(),signInDetails.getPassword());
		return  ResponseEntity.ok(res);
		
	}
	
	@PostMapping("/signUp")
	public ResponseEntity<?> signUp(@RequestBody Users user) {
		
		String email = user.getEmail();
		String res = "Please try with a new email id";
		if(this.user.existingUser(email))
		{
			return ResponseEntity.ok(res) ;
		}
		res = this.user.signUp(user);
		return  ResponseEntity.ok(res);
		
	}
}
