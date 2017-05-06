package com.learning;

import com.learn.day3.AccessModifier;

public class ModifierTestOutsidePackage {

	public static void main(String[] args) {
		AccessModifier access = new AccessModifier();
		System.out.println(access.publicVar);
		//System.out.println(access.privateVar); // Private Variable cannot be acessed outside class
		//System.out.println(access.protectedVar); // protected variables not visible 
		//System.out.println(access.defaultVar); // default variables not visible 

	}

}
