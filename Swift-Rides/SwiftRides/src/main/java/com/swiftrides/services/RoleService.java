package com.swiftrides.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.Role;
import com.swiftrides.repositories.RoleRepository;

@Service
public class RoleService 
{
	@Autowired
	RoleRepository rrepo;
	
	
	public Role getRole(int id)
	{
		return rrepo.findById(id).get();
	}


	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return rrepo.findAll();
	}
	
}
