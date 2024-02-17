package com.swiftrides.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.Car_Company;
import com.swiftrides.services.Car_CompanyService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Car_CompanyController 
{
	@Autowired
	Car_CompanyService cmservice;
	
	@GetMapping("/getAllCarCompany")
	public List<Car_Company> getCarCompany()
	{
		return cmservice.getCarCompany();
	}
}
