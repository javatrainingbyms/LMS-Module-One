package com.ms;

public class ImportedProduct extends Product {
	private int exciseDuty;

	public int getExciseDuty() {
		return exciseDuty;
	}
	public void showTax() {
		System.out.println("Excise : "+(getPrice()*exciseDuty/100));
	}
	public void setExciseDuty(int exciseDuty) {
		this.exciseDuty = exciseDuty;
	}
	
	public void info() {
		System.out.println("IP : "+getCode()+","+getName()+","+getPrice()+","+getExciseDuty());
	}
}
