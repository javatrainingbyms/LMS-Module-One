package com.ms;

public class Account {
	private int ano;
	private String cname;
	private int balance;
	
	
	public Account(int ano, String cname, int balance) {
		super();
		this.ano = ano;
		this.cname = cname;
		this.balance = balance;
	}

	public void info() {
		System.out.println(ano+","+cname+","+balance);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
