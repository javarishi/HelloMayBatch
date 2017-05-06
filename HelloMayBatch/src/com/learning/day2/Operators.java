package com.learning.day2;

public class Operators {

	public static void main(String[] args) {
		int first = 100;
		int second = 202;
		
		int sum = first + second;
		System.out.println("Addition " + sum);
		//To-Do Subtract 
		
		//To-Do multiplication
		
		//To-Do devision
		
		// Modulus 
		float mod = second % first;
		System.out.println("Mod :: " + mod);
		
		// Addition of 1
		System.out.println(first++); // ++ USe the value and increment
		System.out.println(first);
		
		// increment prior to use
		System.out.println(++second);
		
		//To-Do decrement operator
		
		boolean third = false;
		System.out.println(third);
		System.out.println("With negation operator ::" + !third);
		
		// Comparators < > <= >= != ==
		boolean check = (second == first);
		System.out.println("Check " + check);
		
		boolean check2 = first > 200;
		boolean check3 = second > 200;
		
		// & 
		/* 		T 	T	T
		 * 		T	F	F
		 * 		F	T	F
		 * 		F	F	F
		 */
		boolean andResult = check2 && check3;
		// && fir first condition is false, second will not be evaluated
		System.out.println("andResult :: " + andResult);
		
		// |
		/* 		T 	T	T
		 * 		T	F	T
		 * 		F	T	T
		 * 		F	F	F
		 */
		boolean orResult = check2 || check3;
		// || - if first condition is true, second will not be evaluated 
		System.out.println("orResult :: " + orResult);
	}

}
