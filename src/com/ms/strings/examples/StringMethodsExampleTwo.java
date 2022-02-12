package com.ms.strings.examples;

public class StringMethodsExampleTwo {

	public static String printNameOnly(String fullName) {
		//int idx=fullName.indexOf('.');
		int idx=fullName.lastIndexOf('.');
		String name=fullName.substring(0, idx);
		System.out.println(fullName);
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) {
		printNameOnly("student.info.txt");
		/*
		String s="this is java code and java is object oriented";
		//int idx=s.indexOf('d');//this will give us the first occurence of 'd' (if not found, -1)
		//int idx=s.indexOf('d',45);//looking for d but search will start from 20
		int idx=s.indexOf("is",3);
		System.out.println(idx);
		*/
	}

}
/*
	indexOf, lastIndexOf, 
*/
