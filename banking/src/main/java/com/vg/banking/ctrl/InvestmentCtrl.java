package com.vg.banking.ctrl;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vg.banking.dto.Investment;
import com.vg.banking.service.InvestmentService;

@RestController
@RequestMapping("/invest")
public class InvestmentCtrl {
	
	
	@Autowired
	InvestmentService iService;
	
	
	@PostMapping(path = "/")
	public Investment add(@RequestBody Investment investment) {
		System.out.println("adding a user");
			return iService.add(investment);
			

	}
	
	@GetMapping(path = "/{id}")
	public void getInvestmentById(@PathVariable("id") String id) {
		
		if(iService.resultById(id)==true)
			System.out.println("peaceful");
		else
			System.out.println("painful");
	}
}
