package com.test2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtableiterator {
	public static void main(String[] args) {
	    String str;
	    Hashtable<String, String> hashtable = new Hashtable<String, String>();
	    hashtable.put("A", "Apple");
	    hashtable.put("B", "Orange");
	    hashtable.put("C", "Mango");
	    hashtable.put("D", "Banana");
	    hashtable.put("E", "Grapes");
	    System.out.println("Hashtable contains:");
	    Set<String> keys = hashtable.keySet();
	    Iterator<String> itr = keys.iterator();
	    while (itr.hasNext()) { 
	       str = itr.next();
	       System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
	    } 
	 }
	}