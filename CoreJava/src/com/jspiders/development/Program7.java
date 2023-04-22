package com.jspiders.development;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Deserialization
//The process of converting bytes into Java Object

public class Program7 {

	public static void main(String[] args) {
		
		String path = "C:/Users/sbynd/Documents/FileHandling/panDeets.txt";
		
		try {
			//1) Create an object of FileInputStream and pass the location of the file as constructor argument
			FileInputStream in = new FileInputStream(path);
			
			//2) Create an object of ObjectInputStream and pass the InputStream as Constructor argument
			ObjectInputStream fin = new ObjectInputStream(in);
			
			//3) Call the method which will convert and transfer readObject():Object throws IOException
			Object ob = fin.readObject();
			System.out.println(ob);
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
