package com.facebook_loginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void vaildloginTest() {
		System.out.println("validlogin Test");
		driver.findElement(By.id("email")).sendKeys ("nj@vmail");
		driver.findElement(By.id("pass")).sendKeys("kljklj");
		driver.findElement(By.Name("login")
		
	}
           
	
		
	

	public void InvaildloginTest() {
		System.out.println("invalidlogin Test");
		
	}  
}
