package com.jspiders.development;

import java.io.File;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		String path = "C:/Users/sbynd/Documents/FileHandling/data.pdf";
		File f1 = new File(path);
		try {
			boolean res = f1.createNewFile();
			System.out.println("file created="+ res);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
