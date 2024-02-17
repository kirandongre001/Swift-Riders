package com.swiftrides.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.Car_Company;

@Repository
public interface Car_CompanyRepository extends JpaRepository<Car_Company, Integer> {

}

