package com.vg.banking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="usercredentials")
public class Login {

	@Id
	@Column(name="investment_id" ,length=15)
	private String investmentId;
	
	@Column(name="name", length=20)
	private String name;
	
	@Column(name="pwd", length=20)
	private String pwd;

	public String getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(String investmentId) {
		this.investmentId = investmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Login(String investmentId, String name, String pwd) {
		super();
		this.investmentId = investmentId;
		this.name = name;
		this.pwd = pwd;
	}

	public Login() {
		super();
	}

	@Override
	public String toString() {
		return "Login [investmentId=" + investmentId + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
	
	
}
