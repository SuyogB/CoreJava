package com.jspiders.polymorphism;
//Abstraction

//1) Generalize the common properties of the classes and store it in an interface 
interface Zomato {
	void menu();
	void order();
	void deliver();
}

//2) Provide the implementation for the abstract method present in the interface inside implementation class
class Mcdonalds implements Zomato{
	public void menu() {
		System.out.println("Welcome to Mcdonalds");
		System.out.println("Burgers and Meals");
	}
	
	public void order() {
		System.out.println("Collect the order from customer");
		System.out.println("Generate order number");
		System.out.println("Prepare the order using Mcdonalds");
	}
	
	public void deliver() {
		System.out.println("Handover the parcel from Mcdonalds");
	}
}

//2) Provide the implementation for the abstract method present in the interface inside implementation class
class Dominos implements Zomato{
	public void menu() {
		System.out.println("Welcome to Dominos");
		System.out.println("Pizzas and Meals");
	}
	
	public void order() {
		System.out.println("Collect the order from customer");
		System.out.println("Generate order number");
		System.out.println("Prepare the order using Dominos");
	}
	
	public void deliver() {
		System.out.println("Handover the parcel from Dominos");
	}
}

//2) Provide the implementation for the abstract method present in the interface inside implementation class
class AdyarBhavan implements Zomato{
	public void menu() {
		System.out.println("Welcome to AdyarBhavan");
		System.out.println("South Indian Meals");
	}
	
	public void order() {
		System.out.println("Collect the order from customer");
		System.out.println("Generate order number");
		System.out.println("Prepare the order using AdyarBhavan");
	}
	
	public void deliver() {
		System.out.println("Handover the parcel from AdyarBhavan");
	}
}


class ZomatoApp {
	Zomato onlineOrder(char select) {
		if(select == 'm') {
			return new Mcdonalds();
		}
		else if(select == 'd') {
			return new Dominos();
		}
		else {
			return new AdyarBhavan();
		}
	}
}


public class Program17 {

	public static void main(String[] args) {
		System.out.println("this is user...");
		
		//3) Create the object of Implementation Class and store it in interface reference variable
		ZomatoApp app1 = new ZomatoApp();
		Zomato zt = app1.onlineOrder('m');
		
		//4) Access the implementation class Methods using interface reference variable
		zt.menu();
		zt.order();
		zt.deliver();

	}

}
