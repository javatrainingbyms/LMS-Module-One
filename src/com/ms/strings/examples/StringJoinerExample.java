package com.ms.strings.examples;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		String s1="indore", s2="bhopal", s3="mumbai";
		
		//StringJoiner sj=new StringJoiner("--");
		StringJoiner sj=new StringJoiner("--","({==>","<==})");
		sj.add(s1); sj.add(s2); sj.add(s3);
		System.out.println(sj.toString());

	}

}
