package com.jspiders.libraries;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		long contactNumber = ref.nextLong();
		System.out.println("cn="+contactNumber);
		
		
		System.out.println("Enter the amount");
		double amt = ref.nextDouble();
		System.out.println("amt="+amt);
		ref.close();
	}

}
