package com.test2;

public class FinallyException {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally printed");
		}
		System.out.println("Rest code");
	}
}
