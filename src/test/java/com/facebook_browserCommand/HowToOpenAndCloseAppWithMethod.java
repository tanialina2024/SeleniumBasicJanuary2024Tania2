package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseAppWithMethod {
	WebDriver driver;
	
	// regression testing/smoke test
	
	
	// how to you open Application?
	@BeforeMethod
	public void openAppliction() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver ();
	
	driver.get("https://www.facebook.com/");
	//how to you maximize application
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		
	}
  //test
	@Test
	public void validLoginTest() {
	System.out.println("this is vail login");	
	driver.findElement(By.id("email")).sendKeys("Tania");
	driver.findElement(By.id("pass")).sendKeys("kljklj");	
	driver.findElement(By.name("login")).click();	
		
	}
	
	@Test
	public void InvailLoginTest () {
		System.out.println("this is invail login");
		driver.findElement(By.id("email")).sendKeys("Tania");
		driver.findElement(By.id("pass")).sendKeys("jjj");	
		driver.findElement(By.name("login")).click();	
		
	}
	
	
	
  // how to closeApp
	@AfterMethod
	public void closeApplication () {
		driver.quit();
		//driver.close();
		
	}
	

}
