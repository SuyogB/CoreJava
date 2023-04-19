package com.jspiders.libraries;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		String sentence = ref.nextLine();
		System.out.println("sentence "+sentence);

		System.out.println("Enter a word");
		String word = ref.next();
		System.out.println("word "+word);

	}

}
