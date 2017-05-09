package com.learn.day4;

public class CreditCardCustomer extends com.learn.day5.Customer {
	
	public CreditCardCustomer() {
		System.out.println("CreditCardCustomer Constructor");
	}

	
	public void tryAccessingParentMethod(){
		System.out.println("Testing protected Variables outside package :: " + protectedVar);
		methodFromCustomer();
	}
	
	
	public static void main(String[] args) {
		CreditCardCustomer ccCust = new CreditCardCustomer();
		ccCust.tryAccessingParentMethod();
	}
}
