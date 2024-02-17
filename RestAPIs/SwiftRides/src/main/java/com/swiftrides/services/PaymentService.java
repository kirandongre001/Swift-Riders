package com.swiftrides.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.Payment;
import com.swiftrides.repositories.PaymentRepository;

@Service
public class PaymentService 
{
	@Autowired
	PaymentRepository prepo;
	
	public Payment save(Payment p)
	{
		return prepo.save(p);
	}
}

