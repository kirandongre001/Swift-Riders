package com.swiftrides.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.Car_Company;
import com.swiftrides.models.Car_Model;
import com.swiftrides.services.Car_ModelService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Car_ModelController 
{

	@Autowired
	Car_ModelService cmodelservice;
	
	@GetMapping("/getAllCarModels")
	public List<Car_Model> getAllCarModels()
	{
		return cmodelservice.getAllCarModels();
	}
	
	@GetMapping("getcarmodelsfromcompanyid")
	public List<Car_Model> getCarModels(@RequestParam("comapnyid") Car_Company comapnyid)
	{
		return cmodelservice.getCarModels(comapnyid);
	}
}

