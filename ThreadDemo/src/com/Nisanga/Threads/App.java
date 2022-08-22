package com.Nisanga.Threads;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Thread.activeCount());
		//System.out.println(Thread.currentThread().getName());
		
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println(mythread.isAlive());

	}

}
