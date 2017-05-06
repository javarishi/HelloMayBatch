package com.learning;

import com.learn.day3.AccessModifier;

public class MoifierChildForTest extends AccessModifier{

	void childVariables(){
		System.out.println(publicVar);
		//System.out.println(privateVar);
		System.out.println(protectedVar);// Outside the package but accessible to child
		//System.out.println(defaultVar); // Not accessible
	}
	
	
	public static void main(String[] args) {
	
	}

}
