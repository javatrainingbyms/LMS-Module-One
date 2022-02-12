package com.ms.strings.examples;

public class StringPoolExample {

	public static void main(String[] args) {
		
		String name="Manish";
		String birthPlace="Indore";
		String educationPlace="Indore";
		String workPlace="Indore";
		
		System.out.println(name==birthPlace);
		System.out.println(birthPlace==educationPlace);
		System.out.println(educationPlace==workPlace);
		/*
		String s1=new String("indore");
		String s2=new String("indore");
		String s3="india";
		String s4="india";
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		*/

	}

}
