package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class MiniProject {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user_name = driver.findElement(By.xpath(" //input[@data-testid='royal_email']"));
		
		user_name.sendKeys("loki@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("loki123");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
		WebElement find_login = driver.findElement(By.xpath("//a[contains(text( ),'account and log in')]"));
		find_login.click();  	
		
		WebElement email_address = driver.findElement(By.xpath("//input[@id='identify_email']"));
		email_address.sendKeys("lokesh@gmail.com");
		
		WebElement search = driver.findElement(By.xpath("//button[@id='did_submit']"));
		search.click();
		
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\dell\\eclipse-workspace\\SeleniumProject1\\Screenshot\\s1.png");
		FileHandler.copy(src, dest);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
