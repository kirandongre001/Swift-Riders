package com.swiftrides.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.ExtraPassenger;
import com.swiftrides.models.Login;
import com.swiftrides.models.Passenger;
import com.swiftrides.models.User;
import com.swiftrides.repositories.PassengerRepository;


@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository prepo;
	
	
	public Passenger savePassenger(Passenger passenger)
	{
		return prepo.save(passenger);
	}

	public List<Passenger> getPassenger()
	{
		return prepo.findAll();
	}
	
}

