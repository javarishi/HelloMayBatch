package com.learn.day3;

public class AccessModifier {
	
	// public variable
	public String publicVar = "Public Variable";
	// private variable
	private String privateVar = "Private Variable";	
	// protected variable
	protected String protectedVar = "Protected Variable";
	// default variable
	String defaultVar = "Default Variable";
	
	void accessVariables(){
		System.out.println(publicVar);
		System.out.println(privateVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
	}
	
	public static void main(String[] args) {
		AccessModifier access = new AccessModifier();
		access.accessVariables();
	}
	
}
