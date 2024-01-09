package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
	
	
	@Test
	
	public void m1Test () {
		System.out.println("Hello Selenium tester");
		
		
		
		//bonigarcia this is exe file
		WebDriverManager.chromedriver().setup();
		//this is our browser version, always update one from chrome/default
		driver= new ChromeDriver ();
		//facebook url
		driver. get ("https://www.facebook.com/");
		
	}

}
