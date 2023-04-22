package com.jspiders.collections;

//Singleton Design Pattern

class DataBase {
	private static DataBase ref = null; 
	//1) Declare the Constructor Private
	private DataBase() {
		System.out.println("database created");
	}
	
	void storeData(String data) {
		System.out.println("store the data " + data);
	}
	
	//2)Declare a Static Method which return object of same class
	public static DataBase getDataBase() {
	
		//3) Write the Logic inside static method to create only one object for the class	
		if(ref == null) {
			ref = new DataBase();
		}
		return ref;
	}
}

public class Program12 {
	public static void main(String[] args) {
		DataBase db1 = DataBase.getDataBase();
		db1.storeData("aadhar=123456789L");
		
		DataBase db2 = DataBase.getDataBase();
		db2.storeData("aadhar=1122334455L");
		
		DataBase db3 = DataBase.getDataBase();
		db3.storeData("aadhar=24680");
	}
}
