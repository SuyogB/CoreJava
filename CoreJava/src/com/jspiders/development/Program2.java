package com.jspiders.development;

class OwnThread implements Runnable{
	public void run() {
		for (int i =5; i >=1; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Program2 {

	public static void main(String[] args) {
		System.out.println("hello");
		OwnThread o1 = new OwnThread();
		Thread t1 = new Thread(o1);
		t1.start();
		OwnThread o2 = new OwnThread();
		Thread t2 = new Thread(o2);
		t2.start();
		System.out.println("the end");

	}

}
