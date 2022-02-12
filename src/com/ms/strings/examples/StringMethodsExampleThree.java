package com.ms.strings.examples;

public class StringMethodsExampleThree {

	public static void printChars(String s) {
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		printChars("indore");
		printChars(String.valueOf(12345));
		printChars(String.valueOf(255.65));
		/*
		String s="ABCDEF";
		String ch=String.valueOf(s.charAt(2));
		System.out.println(ch);
		*/
		//char ch=s.charAt(2);
		//String val=""+ch;
		//String val=String.valueOf(ch);
		//System.out.println(val);
		
		
		//char ch=s.charAt(1);
		//System.out.println(ch);
		/*
		char c[]=s.toCharArray();
		for(char item:c) {
			System.out.println(item);
		}
		*/
		/*
		byte b[]=s.getBytes();
		for(byte item:b) {
			System.out.println(item);
		}
		*/
	}

}
/*
    Extracting some part of string
  	charAt, toCharArray, getBytes
  	
*/
