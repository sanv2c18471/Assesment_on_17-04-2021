package com.test2;
import java.io.IOException;
public class SuperClassmethodoveriding {
	    void method()
	    {
	        System.out.println("SuperClass");
	    }
	}
class SubClass extends SuperClassmethodoveriding {
	  public void method() throws Exception
	    {
	        System.out.println("SubClass");
	    }
	    public static void main(String args[])
	    {
	        SuperClassmethodoveriding s = new SubClass();
	        s.method();
	    }
	}
