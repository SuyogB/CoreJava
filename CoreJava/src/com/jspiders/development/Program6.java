package com.jspiders.development;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization
//The process of converting java Object into bytes

class PanCard implements Serializable {
	String name;
	String panNumber;
	long contactNumber;
	
	public PanCard(String name, String panNumber, long contactNumber) {
		this.name = name;
		this.panNumber = panNumber;
		this.contactNumber = contactNumber;
	}
	
	public String toString() {
		
		return "PanCard [Name=" + name + ", Pan Number=" + panNumber + ", Contact Number=" + contactNumber + "]";
	}
}

public class Program6 {

	public static void main(String[] args) {
		String path = "C:/Users/sbynd/Documents/FileHandling/panDeets.txt";
		PanCard p1 = new PanCard("Suyog","123456789",911234567L);
		try {
			//1) Create an object of FileOutputStream and pass the location of the file as constructor argument
			FileOutputStream out = new FileOutputStream(path);
			
			//2) Create an object of ObjectOutputStream and pass the outputStream as constructor argument
			ObjectOutputStream fout = new ObjectOutputStream(out);
			
			//3) call the method which will convert and transfer writeObject(Object ob):void throws IOException
			fout.writeObject(p1);
			System.out.println("object written");
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
