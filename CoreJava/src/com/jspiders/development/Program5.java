package com.jspiders.development;

import java.io.FileReader;

public class Program5 {

	public static void main(String[] args) {
		String path = "C:/Users/sbynd/Documents/FileHandling/pan.txt";
		try {
			FileReader fr = new FileReader(path);
			int a = fr.read();
			while(a!= -1) {
				System.out.println((char)a);
				a=fr.read();	
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
