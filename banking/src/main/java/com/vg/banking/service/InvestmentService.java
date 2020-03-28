package com.vg.banking.service;

import org.springframework.stereotype.Service;

import com.vg.banking.dto.Investment;

@Service
public interface InvestmentService {
		
	public Investment add(Investment investment);
	
	public boolean resultById(String id);

}
