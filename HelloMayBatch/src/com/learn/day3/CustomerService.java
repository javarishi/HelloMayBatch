package com.learn.day3;

public class CustomerService {
	
	public CustomerService(){
		System.out.println("Default Constructor");
	}
	
	public CustomerService(String dbName){
		System.out.println("Parameterized Cosntructor " + dbName);
	}
	
	public CustomerService(int zipCode){
		System.out.println("Parameterized Cosntructor " + zipCode);
	}
	

	public String[] getCustomerList(int zipCode) {
		String[] list = null;
		System.out.println("zipCode ::" + zipCode);
		
		return list;
	}
	
	public String[] getCustomerList(String city) {
		String[] list = null;
		System.out.println("city ::" + city);
		
		return list;
	}
	
	public String[] getCustomerList(int zipCode , String city) {
		String[] list = null;
		System.out.println("zipCode ::" + zipCode + " city ::" + city);
		
		return list;
	}
	
	
	public static void main(String[] args) {
		CustomerService service = new CustomerService("Sybase");
		
		service.getCustomerList(33639);
		service.getCustomerList("Tampa");
		service.getCustomerList(33639 , "Tampa");
		
	}
}
