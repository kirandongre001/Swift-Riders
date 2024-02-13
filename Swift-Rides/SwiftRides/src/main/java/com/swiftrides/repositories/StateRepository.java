package com.swiftrides.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}

