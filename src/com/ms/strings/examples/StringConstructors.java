package com.ms.strings.examples;

public class StringConstructors {
	
	public static void show(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		String s1=new String();
		String s2=new String("indore");
		char ch[]= {'a','b','c','d','e','f','g','h','i','j'};
		String s3=new String(ch);
		String s4=new String(ch,5,3);
		byte b[]= {65,66,67,68,69,70,71,72,73,74,75};
		String s5=new String(b);
		String s6=new String(b,2,5);
		show(s1);
		show(s2);
		show(s3);
		show(s4);
		show(s5);
		show(s6);
		
	}

}
