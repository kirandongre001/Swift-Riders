package com.swiftrides.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.User;
import com.swiftrides.models.Vehicle;
import com.swiftrides.repositories.VehicleRepository;

@Service
public class VehicleService 
{
	@Autowired
	VehicleRepository vrepo;
	
	public Vehicle saveVehicle(Vehicle v) 
	{
		return vrepo.save(v);
	}
	
	public Vehicle getVehicleId(int id)
	{
		return vrepo.findById(id).get();
	}
	
	public List<Vehicle> getVehicles(User userid)
	{
		return vrepo.getAllVehiclesFromUsers(userid);
	}
}
