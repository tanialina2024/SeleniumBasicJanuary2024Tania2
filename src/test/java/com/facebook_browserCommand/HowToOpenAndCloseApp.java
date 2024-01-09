package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseApp {
	WebDriver driver;
	
	// how to you open Application?
	// functional testing
	
	@BeforeTest
	public void openAppliction() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver ();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
	
		
	}
  //test
	@Test
	public void userNameTest() {
	System.out.println("this is userNameTest");	
	driver.findElement(By.id("email")).sendKeys("Tania");
			
		
	}
	
	@Test
	public void passWordTest () {
		System.out.println("this is passWordTest");
		driver.findElement(By.id("pass")).sendKeys("kljklj");
		
	}
	@Test
	public void LoginButtonTest () {
		System.out.println("this is LoginButtonTest");
		driver.findElement(By.name("login")).click();
	}
	
	
	
  // how to closeApp
	@AfterTest
	public void closeApplication () {
		//driver.quit();
		//driver.close();
		
	}
	

}
