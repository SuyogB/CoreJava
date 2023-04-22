package com.jspiders.development;

class MyThread extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Program1 {
	public static void main(String[] args) {
		System.out.println("hello");
		MyThread m1 = new MyThread();
		m1.start();
		MyThread m2 = new MyThread();
		m2.start();
		MyThread m3 = new MyThread();
		m3.start();
		System.out.println("the end.....");
	}
}
