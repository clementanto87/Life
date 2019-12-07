package com.multithread.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OneThreadAfterAnotherExeution {

	int count;
	Object o1;
	Object o2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneThreadAfterAnotherExeution p = new OneThreadAfterAnotherExeution();
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++){
		e.submit(p::method1);
		e.submit(p::method2);
		}
		e.shutdown();
		
		
	}

	public void method1(){
		System.out.println(Thread.currentThread().getName()+" : "+count++);
		synchronized (this) {
			
			try {
				this.notify();
				this.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void method2(){
		System.out.println(Thread.currentThread().getName()+" : "+count++);
		synchronized (this) {
			
			try {
				
				this.notify();
				this.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
