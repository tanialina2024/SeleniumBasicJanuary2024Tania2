package com.facebook_base;

import org.testng.annotations.Test;

public class IfAndElse {
	
	@Test
	
	public void conditionalStatement() {
		/*if else statement
		 * one or multiple if condition with body of code
		 * and option else block
		 * one of the condition will be true and only that block of code will run
		 * 
		 * 
		 */
		
		
		int age =35;// flag
		if(age<=18) {
			System.out.println("you can vote");
		
		}else if (age<=25) {
			System.out.println("you can run office");
		}else if (age<=45) {
			System.out.println("you should run for office");
		}else {
			System.out.println("I am not sure why you can not vote");
		
	}

	}
}
