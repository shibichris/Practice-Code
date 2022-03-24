package com.ood.concepts.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		CashPayment c = new CashPayment();
		c.pay();
		Payment p = new CashPayment();
		p.pay(); 

		p = new CreditPayment();
		p.pay();
	}

}

interface Payment {
	public void pay();
}

class CashPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("This is cash payment");
	}

}

class CreditPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}

}