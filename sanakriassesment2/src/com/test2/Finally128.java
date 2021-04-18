package com.test2;

public class Finally128 {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} 
		finally {
			System.out.println("finally printed");
		}
		System.out.println("Rest code");
	}
}
