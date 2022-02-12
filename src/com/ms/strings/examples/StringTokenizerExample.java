package com.ms.strings.examples;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String s = "java,python;oracle,sybase";

		StringTokenizer st = new StringTokenizer(s,",;" );
		while (true) {
			boolean found=st.hasMoreTokens();
			if(!found)break;
			System.out.println(st.nextToken());
		}
	}

}
/*
 * nextToken, hasMoreTokens()
 */
