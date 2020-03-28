package com.vg.banking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="userDetails")
public class Investment {
	
	@Id
	@Column(name="investment_id" ,length=15)
	private String investmentId;
	
	@Column(name="pwd", length=20)
	private String pwd;
	
	@Column(name="income", length=10)
	private long income;
	
	@Column(name="expenses", length=10)
	private long expenses;
	
	@Column(name="asset",length=10)
	private long asset;
	
	
	@Column(name="life_ex",length=5)
	private int lifeExpectancy;


	public String getInvestmentId() {
		return investmentId;
	}


	public void setInvestmentId(String investmentId) {
		this.investmentId = investmentId;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public long getIncome() {
		return income;
	}


	public void setIncome(long income) {
		this.income = income;
	}


	public long getExpenses() {
		return expenses;
	}


	public void setExpenses(long expenses) {
		this.expenses = expenses;
	}


	public long getAsset() {
		return asset;
	}


	public void setAsset(long asset) {
		this.asset = asset;
	}


	public int getLifeExpectancy() {
		return lifeExpectancy;
	}


	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}


	public Investment(String investmentId, String pwd, long income, long expenses, long asset, int lifeExpectancy) {
		super();
		this.investmentId = investmentId;
		this.pwd = pwd;
		this.income = income;
		this.expenses = expenses;
		this.asset = asset;
		this.lifeExpectancy = lifeExpectancy;
	}


	public Investment() {
		super();
	}


	@Override
	public String toString() {
		return "Investment [investmentId=" + investmentId + ", pwd=" + pwd + ", income=" + income + ", expenses="
				+ expenses + ", asset=" + asset + ", lifeExpectancy=" + lifeExpectancy + "]";
	}
	
	
	

}
