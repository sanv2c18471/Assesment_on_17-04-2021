package com.test2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashtablejava8 {
	public static void main(String[] args) {
		Map<Integer,String> table = new Hashtable<>();
		table.put(1,"Pen");
		table.put(2,"Book");
		table.put(3,"Clothes");
		table.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	}
}