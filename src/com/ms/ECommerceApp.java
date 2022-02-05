package com.ms;

public class ECommerceApp {

	public static void showInfo(Product product) {
		product.info();
		product.showTax();
	}
	
	public static void main(String[] args) {
		DomesticProduct dp=new DomesticProduct(); dp.setCode(111);dp.setName("AAA");dp.setPrice(1000); dp.setGstRate(5);
		ImportedProduct ip=new ImportedProduct(); ip.setCode(222);ip.setName("BBB");ip.setPrice(2000); ip.setExciseDuty(8);
		showInfo(dp);
		showInfo(ip);
	}

}
