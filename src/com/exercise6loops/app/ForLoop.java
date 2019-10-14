package com.exercise6loops.app;

public class ForLoop {

	public static void main(String[] args) {
		//constant declaration
		
		//Variable declaration
		
		//Objects construction
		System.out.println("Display series from 1 to 100");
		//Create a series from 1 to 100 step by 1
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("Display series from 100 to 1");
		
		//Create a series from 100 to 1 step by 1
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Display odd numbers from 100 to 200");
		
		//Create a series from 100 to 1 step by 1
		for(int i=100; i<200; i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Display half series from 100 to 200");
		
		//100 to 150
		for(int i=100; i<200; i++) {
			
			if(i==150) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
