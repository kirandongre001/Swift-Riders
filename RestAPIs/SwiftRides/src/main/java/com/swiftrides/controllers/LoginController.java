package com.swiftrides.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.Login;
import com.swiftrides.models.LoginCheck;
import com.swiftrides.services.LoginService;



@CrossOrigin(origins = "http://localhost:3000") 
@RestController
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	@PostMapping("/checkLogin")
	public Login chkLogin(@RequestBody LoginCheck lcheck)
	{
		return lservice.getLogin(lcheck.getLogin_id(), lcheck.getPassword());
	}
	
	@GetMapping("/updateStatus")
	public int updateStatus(@RequestParam("status")boolean status,@RequestParam("id") int id)
	{
		return lservice.updateStatus(status, id);
	}
}
