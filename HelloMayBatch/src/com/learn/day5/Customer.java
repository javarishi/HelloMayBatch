package com.learn.day5;

public class Customer {
	
	private String privateVar = "privateVar";
	protected String protectedVar = "protectedVar";
	
	public Customer() {
		this("Id");
		System.out.println("Customer Constructor with id " );
	}
	
	public Customer(String id) {
		System.out.println("Customer Constructor with id " + id);
	}

	protected void methodFromCustomer(){
		System.out.println("Customer methodFromCustomer");
	}

}
