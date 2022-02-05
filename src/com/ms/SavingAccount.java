package com.ms;

public class SavingAccount extends Account {

	public String nominee;
	
	
	public SavingAccount(int ano, String cname, int balance, String nominee) {
		super(ano, cname, balance);
		this.nominee = nominee;
	}



	public void info() {
		System.out.println("Saving Account Information :");
		super.info();
		System.out.println(nominee);
	}



	public String getNominee() {
		return nominee;
	}



	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
}
