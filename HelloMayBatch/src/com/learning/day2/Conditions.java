package com.learning.day2;

import java.util.Calendar;

public class Conditions {

	public static void main(String[] args) {
		int first = 100;
		int second =200;
		// if - else
		if(first >= 300){
			System.out.println("First crossed 200");
		}else if(second  >= 300){
			System.out.println("Second crossed 200");
		}else{
			System.out.println("No one crossed 300");
		}
		// switch case
		
		// On Different dates my store opens at different time
		int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.getInstance().getTime());
		switch(day){
			case 1: {
				System.out.println("Open store at 10:00 am");
				break;
			}
			case 2: {
				System.out.println("Open store at 7:00 am");
				break;
			}
			case 3: {
				System.out.println("Open store at 7:00 am");
				break;
			}
			case 4: {
				System.out.println("Open store at 8:00 am");
				break;
			}
			case 5: {
				System.out.println("Open store at 8:30 am");
				break;
			}
			case 6: {
				System.out.println("Open store at 9:00 am");
				break;
			}
			case 7: {
				System.out.println("Open store at 10:00 am");
				break;
			}
			default : {
				System.out.println("Not sure of Day Value. Just Open store at 10:00 am");
				break;
			}
		
		}
		

	}

}
