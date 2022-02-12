package com.ms.strings.examples;

public class StringBufferEample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdefgh");
		System.out.println(sb);
		String s=sb.toString();
		s=s.toUpperCase();
		System.out.println(s);
		//sb.reverse();
		//sb.setLength(15);
		//sb.append("XYZ");
		//sb.insert(0, "XYZ");
		//sb.replace(1, 4, "XYZ");
		//sb.setCharAt(3, 'Z');
		//sb.deleteCharAt(3);
		//sb.delete(1, 4);
		System.out.println(sb);
	}

}
/*
    append, insert, replace, setCharAt, deleteCharAt, delete, setLength, 
    reverse, toString

*/