package com.swiftrides.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.ExtraPassenger;
import com.swiftrides.models.Login;
import com.swiftrides.models.Passenger;
import com.swiftrides.models.Role;
import com.swiftrides.models.User;
import com.swiftrides.models.UserReg;
import com.swiftrides.services.LoginService;
import com.swiftrides.services.PassengerService;
import com.swiftrides.services.RoleService;
import com.swiftrides.services.UserService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PassengerController {
	
	@Autowired
	PassengerService pservice;
	
	@Autowired
	UserService uservice;
	
	@GetMapping("/getPassenger")
	public List<Passenger> getAllPassenger()
	{
		return pservice.getPassenger();
	}
	
	
	@PostMapping("/insertPassenger")
	public Passenger savePassenger(@RequestBody ExtraPassenger ep ) {
		
		//System.out.println(ep);
		User u=uservice.getUserId(ep.getUser_id());
		Passenger passenger=new Passenger(ep.getAadhar_no(),ep.getPhone_no(),ep.getEmail(),ep.getFname(),ep.getLname(),ep.getGender(),u);
		return pservice.savePassenger(passenger);
		
		
	}
	


}


