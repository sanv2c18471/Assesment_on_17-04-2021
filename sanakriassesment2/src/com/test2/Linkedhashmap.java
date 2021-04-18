package com.test2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linkedhashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
    map.put(101,"Anu");    
    map.put(100,"sam");    
    map.put(102,"Ram");    
     Set s = map.entrySet();
     Iterator itr = s.iterator();
	    while (itr.hasNext()) { 
	    	System.out.println(itr.next());
	    }
} 
}