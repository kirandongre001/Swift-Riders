package com.swiftrides.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.Passenger_Review;
import com.swiftrides.models.State;
import com.swiftrides.models.User;
import com.swiftrides.repositories.Passenger_ReviewRepository;

@Service
public class Passenger_ReviewService {
	
	@Autowired
	Passenger_ReviewRepository prepo;
	
	public List<Passenger_Review> getAllPassenger_Review()
	{
		return prepo.findAll();
	}
	
	
	public Passenger_Review getOnePassengerReview(int previewid)
	{
		Optional<Passenger_Review> opreview=prepo.findById(previewid);
		Passenger_Review p;
		try
		{
			p=opreview.get();
		}
		catch(Exception e)
		{
			p=null;
		}
		return p;
	}
	
	public Passenger_Review savePassenger_Review(Passenger_Review preview)
	{
		return prepo.save(preview);
	}
}

