package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	String browser= "chrome";
	public WebDriver driver;
	

	@BeforeMethod
	public void  openApplication() {
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
		if(browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			if(browser.equalsIgnoreCase("firefox")) {
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("hello please use chrome or edge or firefox");
			
		}
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		}
}
		
		@Test
		public void LoginTest () {
		
		}
		
		@AfterMethod
		public void CloseApplication () {
			if (driver !=null) {
				driver.quit();
			}
		
		
	}
}
