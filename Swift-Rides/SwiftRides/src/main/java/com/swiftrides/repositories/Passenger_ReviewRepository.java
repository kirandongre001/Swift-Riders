package com.swiftrides.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.Login;
import com.swiftrides.models.Passenger_Review;
import com.swiftrides.models.User;

@Repository
public interface Passenger_ReviewRepository extends JpaRepository<Passenger_Review, Integer>{
	
}

