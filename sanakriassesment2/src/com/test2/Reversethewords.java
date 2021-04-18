package com.test2;

public class Reversethewords {
public static void main(String[] args) {
	String s="Java is Best";
    String [] temp = s.split(" ");
    String result= " ";
    for(int i=0;i<temp.length;i++) {
    	if(i==temp.length-1)
    		result = temp[i]+result;
    	else
    		result=" "+temp[i]+result;
    }
	System.out.println(result);
}
}
