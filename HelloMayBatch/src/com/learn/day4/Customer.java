package com.learn.day4;

public class Customer implements ReachableCustomer{

	
	public boolean validateAddress(String address) {
		System.out.println("Provide implementation here :: "  + address);
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Customer Country " + country);
		// country = "India"; - Cannot assign a different value
		
		Customer cust = new Customer();
		cust.validateAddress("3305 Spring Hilll Pwky");
		// You cannot instantiate interface
		//ReachableCustomer rCust = new ReachableCustomer();
		ReachableCustomer rCust = new Customer(); // Reference type
		
	}

}
