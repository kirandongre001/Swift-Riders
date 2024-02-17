package com.swiftrides.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.Login;
import com.swiftrides.models.User;
import com.swiftrides.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public User getUser(Login l)
	{
		return urepo.getUser(l);
	}
	
	public User saveUser(User u)
	{
		return urepo.save(u);
	}
	
	public List<User> getUsers()
	{
		return urepo.findAll();
	}
	
	public User getUserId(int id)
	{
		return urepo.findById(id).get();
	}
}
