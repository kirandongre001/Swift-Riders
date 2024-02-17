package com.swiftrides.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.City;
import com.swiftrides.models.State;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> 
{
	@Query("select c from City c where c.states=:sid")
	public List<City> getCityFromState(State sid);
	
}
