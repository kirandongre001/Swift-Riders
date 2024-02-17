package com.swiftrides.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.Role;
import com.swiftrides.services.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RoleController 
{
	@Autowired
	RoleService rservice;
	
	@GetMapping("/getallroles")
	public List<Role> getAllRoles()
	{
		return rservice.getRoles();
	}
}
