package com.test2;

public class Exceptionmethods {
public static void main(String[] args) {
	System.out.println("Arithemetic Exception");
	try {
		int a=100/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);}
	System.out.println("Rest of the code");
	
	System.out.println("Nullpointer Exception");
	try {
		String s =null;
		System.out.println(s.length());
	}
	catch(NullPointerException e) {
		System.out.println(e);}
	System.out.println("Rest of the code");

	System.out.println("Number format Exception");
	try {
		String s ="hello";
		int i=Integer.parseInt(s);
	}
	catch(NumberFormatException e) {
		System.out.println(e);}
	System.out.println("Rest of the code");
	
	System.out.println("Array index out of bounds Exception");
	try {
		int a[]=new int[5];
		a[10]=50;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);}
	System.out.println("Rest of the code");
	}
}
	




