package com.learn.day5;

public class PreferredCustomer extends Customer{
	
	String pCustVariable = "pCustVariable";
	
	public PreferredCustomer() {
		this("101"); // one constructor from another with this
	}

	public PreferredCustomer(int custId) {
		this(String.valueOf(custId)); // one constructor from another with this
	}
	
	public PreferredCustomer(String custId) {
		// implicit parent constructor call - default constructor
		super(custId);// explicitly calling parents constructor 
		System.out.println("PreferredCustomer Constructor");
		System.out.println("Accessing Variable from Parent ::" + protectedVar);
		
	}
	
	public void childClassMethod(){
		System.out.println("CHild Class Method access");
	}
	
	
	public static void main(String[] args) {
		PreferredCustomer pCust = new PreferredCustomer();
		pCust.childClassMethod();
		
		Customer newCust = new PreferredCustomer(); // using parent class Reference type
		//newCust.childClassMethod(); // You will only see methods from Reference type
		
		Object obj = new PreferredCustomer();
	}
	
}
