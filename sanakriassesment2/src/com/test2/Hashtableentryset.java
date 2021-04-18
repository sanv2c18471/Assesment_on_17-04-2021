package com.test2;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Hashtableentryset {
public static void main(String[] args) {
		    Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		    hashtable.put(121,"Mango");
		    hashtable.put(123,"Apple");
		    hashtable.put(122,"Grapes");
		    System.out.println(hashtable);
		    
		    System.out.println("Using Entry set: ");
		    Set<Entry<Integer,String>> entryset = hashtable.entrySet();
		    for(Entry<Integer,String> s : entryset) {
		    	System.out.println(s.getKey()+" "+s.getValue());
		    }
		    
		    System.out.println("Using Iterator: ");
		    Set<Integer> keys = hashtable.keySet();
	        Iterator <Integer> it = keys.iterator();
		    System.out.println("Hashtable entries : ");
		    while(it.hasNext())
		    {
		   Integer i =it.next(); 
		    System.out.println("key: "+i+" & Value: "+hashtable.get(i));
		  }		
}
}
