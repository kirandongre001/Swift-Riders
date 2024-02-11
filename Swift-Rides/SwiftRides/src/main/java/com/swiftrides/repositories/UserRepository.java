package com.swiftrides.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.Login;
import com.swiftrides.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{
	@Query("select u from User u where user_id=:l")
	public User getUser(Login l);
	
	
}
