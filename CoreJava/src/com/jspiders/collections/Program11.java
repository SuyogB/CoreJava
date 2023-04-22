package com.jspiders.collections;

import java.util.ArrayList;

public class Program11 {
	public static void main(String[] args) {
		ArrayList al  = new ArrayList();
		
		al.add(34); //auto-boxing auto-up-casting
		al.add(3.4f); //auto-boxing auto-up-casting
		al.add(312.4); //auto-boxing auto-up-casting
		al.add(true); //auto-boxing auto-up-casting
		al.add('e'); //auto-boxing auto-up-casting
		al.add(123456789L); //auto-boxing auto-up-casting
		
		for (Object ob : al) {
			System.out.println(ob.toString());
		}
		
	}
}
