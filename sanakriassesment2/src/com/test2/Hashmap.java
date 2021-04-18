package com.test2;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(2, "Mango");
		map.put(1, "Apple");
		map.put(3, "Banana");
		map.put(5, "Grapes");
		map.put(4, "Pineapple");
		map.put(6, "Jackfruit");
		System.out.println("The elements are: ");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Number:" + key + "" + "FruitName:" + " " + map.get(key));
		}
	}
}
