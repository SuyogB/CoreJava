package com.jspiders.polymorphism;

class Trai {
	void provideInternet() {
		System.out.println("network signal....");
	}
}

class AirtelXstream extends Trai{
	
	void provideInternet() {
		System.out.println("Airtel Xstream Network");
	}
	
}

class JioFiber extends Trai {
	void provideInternet() {
		System.out.println("Jio Network");
	}
}

class Bsnl extends Trai {
	void provideInternet() {
		System.out.println("Bsnl Network");
	}
}

class Router {
	void signalReceiver(Trai ref) {
		ref.provideInternet();
	}
}

public class Program16 {
	public static void main(String[] args) {
		Router rt = new Router();
		rt.signalReceiver(new Bsnl());
		rt.signalReceiver(new JioFiber());
		rt.signalReceiver(new AirtelXstream());
	}
}
