package com.test2;

import java.util.Optional;

public class Nullpointerexceptions {
public static void main(String[] args) {
	String s[]=new String [10];  
	Optional <String> test = Optional.ofNullable(s[1]);
	if(test.isPresent())
	{
		String upcase = s[1].toUpperCase();
		System.out.println(upcase);
	}else {
		System.out.println("String is not present");
	}
}
}
