package com.learn.day3;

public class ModifierTestWithinPackage {

	
	public static void main(String[] args) {
		AccessModifier access = new AccessModifier();
		System.out.println(access.publicVar);
		//System.out.println(access.privateVar); // Private Variable cannot be acessed outside class
		System.out.println(access.protectedVar);
		System.out.println(access.defaultVar);
	}
	


}
