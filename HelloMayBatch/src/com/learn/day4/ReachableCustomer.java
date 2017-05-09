package com.learn.day4;

public interface ReachableCustomer {
	// 1. Cannot be private - Only public
	// 2. Initialization is necessary
	// 3. Variables in interfaces are always - public, static and final
	String country = "USA";
	// Methods 
	// 1. No Method body
	// 2. Access Modifier is always Public
	// Methods in interface is always public abstract
	 boolean validateAddress(String address);
}
