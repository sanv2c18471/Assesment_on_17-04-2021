package com.test2;

public class Runnableinterfacethread implements Runnable {
public void run() {
	System.out.println("Thread is running");
}
public static void main(String[] args) {
	Runnableinterfacethread obj = new Runnableinterfacethread();
			Thread threadobj = new Thread(obj);
			threadobj.start();
			System.out.println("Outside Running");
}
}
