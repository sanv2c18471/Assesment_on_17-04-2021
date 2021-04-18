package com.test2;

public class DaemonThreads1 extends Thread {
	public static void main(String[] args) {
	DaemonThreads1 t1 = new DaemonThreads1();
    DaemonThreads1 t2 = new DaemonThreads1();
    DaemonThreads1 t3 = new DaemonThreads1();
    t1.setDaemon(true);
    t1.start(); 
    t2.start();
    t3.start();        
} 
	public void run()
    { 
      
        if(Thread.currentThread().isDaemon())
        { 
            System.out.println("Daemon thread"); 
        } 
          
        else
        { 
            System.out.println("User thread"); 
        } 
    } 
}
