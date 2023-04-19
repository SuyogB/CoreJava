package com.jspiders.polymorphism;

interface UpiApplication {
	void sendMoney();
	void receiveMoney();
	void checkBalance();
}

class GooglePay implements UpiApplication{
	public void sendMoney() {
		System.out.println("Send Money Through Gpay");
	}
	public void receiveMoney() {
		System.out.println("Receive Money Through Gpay");
	}
	public void checkBalance() {
		System.out.println("Check Balance Through Gpay");
	}
}

class PhonePe implements UpiApplication{
	public void sendMoney() {
		System.out.println("Send Money Through PhonePe");
	}
	public void receiveMoney() {
		System.out.println("Receive Money Through PhonePe");
	}
	public void checkBalance() {
		System.out.println("Check Balance Through PhonePe");
	}
}

class Paytm implements UpiApplication{
	public void sendMoney() {
		System.out.println("Send Money Through Paytm");
	}
	public void receiveMoney() {
		System.out.println("Receive Money Through Paytm");
	}
	public void checkBalance() {
		System.out.println("Check Balance Through Paytm");
	}
}

class BankAccount{
	UpiApplication transaction(char app) {
		if(app == 'g') {
			return new GooglePay();
		}
		else if(app == 'p') {
			return new PhonePe();
		}
		else {
			return new Paytm();
		}
	}
}


public class Program18 {
	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		UpiApplication ref = user1.transaction('g');
		ref.sendMoney();
		ref.receiveMoney();
		ref.checkBalance();
	}
}
