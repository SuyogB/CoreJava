package com.jspiders.development;

import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		String pan = "123456ABCD";
		String path = "C:/Users/sbynd/Documents/FileHandling/pan.txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path);
			fw.write(pan);
			System.out.println("File Written");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
