package com.jspiders.polymorphism;
//Runtime Polymorphism
class Zara {
	void buyingClothes() {
		System.out.println("pay the original price");
	}
}

//inheritance
class Myntra extends Zara{
	//method overriding
	void buyingClothes() {
		System.out.println("Buy with 30% offer");
	}
}
//inheritance
class Ajio extends Zara {
	//method overriding
	void buyingClothes() {
		System.out.println("Buy with 35% offer");
	}
}

class Me {
	void shopping(Zara ref) {
		ref.buyingClothes();
	}
}


public class Program15 {
	public static void main(String[] args) {
		Me user1= new Me();
		user1.shopping(new Zara());
		//up-casting
		user1.shopping(new Myntra());
		user1.shopping(new Ajio());
	}
}
