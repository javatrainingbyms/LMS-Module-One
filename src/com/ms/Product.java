package com.ms;

public abstract class Product {
	private int code;
	private String name;
	private int price;
	
	public abstract void showTax();
	
	public void info() {
		System.out.println(code+","+name+"price");
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
