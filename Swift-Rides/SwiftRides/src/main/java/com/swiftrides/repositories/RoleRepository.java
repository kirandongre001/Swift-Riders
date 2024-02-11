package com.swiftrides.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> 
{
	
}
