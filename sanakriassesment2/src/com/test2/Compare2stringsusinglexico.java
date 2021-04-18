package com.test2;

public class Compare2stringsusinglexico {
	public static void main(String[] args) {
		String s1 = "Sam";
		String s2 = "Sam";
		String s3 = "Ramya";
		String s4 = "Abi";
		int result1 = s1.compareTo(s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		if (result1 == 0) {
			System.out.println("Strings are same");
		}

	}
}
