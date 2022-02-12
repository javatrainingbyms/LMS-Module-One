package com.ms.strings.examples;

public class StringMethodsExample {

	public static void identifyFileType(String fileName) {
		if(fileName.endsWith(".exe")) {
			System.out.println("Executable File...!");
		}else if(fileName.endsWith(".jpg")) {
			System.out.println("Image File...!");
		}else if(fileName.endsWith(".xlsx")) {
			System.out.println("Excel File..!");
		}else {
			System.out.println("Unknown Type");
		}
	}
	public static void userAuth(String username, String password) {
		String correctId="lms";
		String correctPw="indore";
		
		if(username.equalsIgnoreCase(correctId)) {
			if(password.equals(correctPw)) {
				System.out.println("Welcome User...!");
			}else {
				System.out.println("Invalid Password...!");
			}
		}else {
			System.out.println("Invalid Username...!");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String s="this string contains the name of programming language java";
		boolean res=s.contains("gram");
		System.out.println(res);
		
		identifyFileType("abc.xlsx");
		identifyFileType("mypic.jpg");
		
		userAuth("lms","indore");
		userAuth("lms","india");
		userAuth("abc","xyz");
		userAuth("Lms","indore");
		userAuth("lms","Indore");
		
		String s1="indore";
		String s2="Indore";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		//String s;
		//s.compare
		
		/*
		String s1=new String("helloworld");
	    String s2=new String("Helloworld");
	    System.out.println(s1==s2);
	    boolean res=s1.equals(s2);
	    System.out.println(res);
	    boolean res1=s1.equalsIgnoreCase(s2);
	    System.out.println(res1);
		*/
	}

}
/*
 
 *			 comparison methods
             equals, equalsIgnoreCase, startsWith, endsWith, compareTo, contains
             
 
*/