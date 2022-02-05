package com.ms;

public class DomesticProduct extends Product {
	private int gstRate;

	public int getGstRate() {
		return gstRate;
	}
	public void showTax() {
		System.out.println("GST : "+(getPrice()*gstRate/100));
	}
	public void setGstRate(int gstRate) {
		this.gstRate = gstRate;
	}
	public void info() {
		System.out.println("DP : "+getCode()+","+getName()+","+getPrice()+","+getGstRate());
	}
}
