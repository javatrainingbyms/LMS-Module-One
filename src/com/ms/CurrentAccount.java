package com.ms;

public class CurrentAccount extends Account {
	private String company;
	
	public void info() {
		System.out.println("Current Account Information : ");
		super.info();
		System.out.println(company);
	}
	
	public CurrentAccount(int ano, String cname, int balance, String company) {
		super(ano, cname, balance);
		this.company = company;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
