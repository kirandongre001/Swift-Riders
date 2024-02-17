package com.swiftrides.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftrides.models.Booking;
import com.swiftrides.models.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> 
{

}

