package com.vg.banking.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.banking.dao.InvestmentRepo;
import com.vg.banking.dto.Investment;


@Service
public class InvestmentServiceImpl implements InvestmentService {
	@Autowired
	InvestmentRepo iRepo;

	@Override
	public Investment add(Investment investment) {
		
		System.out.println("in service impl");
		return iRepo.save(investment);
	
	}

	@Override
	public boolean resultById(String id) {
		
		boolean flag=false;
		ArrayList<Investment> investment = (ArrayList<Investment>) iRepo.findAll();
		for(Investment invest: investment) {
			
			if(invest.getInvestmentId().equals("b001")) {
				
					if(invest.getPwd().equals("rohit")) {
						 
						//if(invest.getInvestmentId().equals(id)) {
				double eReturn=0;
				eReturn = ((invest.getAsset() + (invest.getIncome()-invest.getExpenses())*12*6) * Math.pow(1.06,invest.getLifeExpectancy()));
				if(eReturn>=480000)
					flag=true;
				else 
					flag=false;
			}
					}
			}
		return flag;
		
		/*double eReturn=0;
		eReturn = ((investment.getAsset() + (investment.getIncome()-investment.getExpenses())*12*6) * Math.pow(1.06,investment.getLifeExpectancy()));
		if(eReturn>=480000)
			return true;
		else
		   return false;*/
	}
}
