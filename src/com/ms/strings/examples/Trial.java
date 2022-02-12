package com.ms.strings.examples;

public class Trial {

	public static void main(String[] args) {
		
		String cities[]= {"indore","ujjain","dewas","delhi","mumbai"};
		StringBuffer allCities=new StringBuffer("");
		for(String city:cities) {
			allCities.append(city);
		}
		System.out.println(allCities);
		/*
		String allCities="";
		for(String city:cities) {
			allCities=allCities+city;
		}
		*/
		//System.out.println(allCities);
		
		
		/*
		String s1="indore";
		System.out.println(s1);
		s1=s1+"(m.p.)";
		System.out.println(s1);
		s1=s1+"-India";
		System.out.println(s1);
		*/
	}

}
