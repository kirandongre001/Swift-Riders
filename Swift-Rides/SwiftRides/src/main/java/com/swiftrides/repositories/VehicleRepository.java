package com.swiftrides.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.User;
import com.swiftrides.models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	@Query("select v from Vehicle v where v.users=:uid")
	public List<Vehicle> getAllVehiclesFromUsers(User uid);
}
