package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
         ch.addArguments("Incognito");
         
         WebDriver driver = new ChromeDriver(ch);
         driver.manage().window().maximize();
         
         driver.get("https://demoqa.com/alerts");
         
         driver.findElement(By.id("alertButton")).click();
         
         Alert simple_alert = driver.switchTo().alert();
         Thread.sleep(3000);
         simple_alert.accept();
         
         WebElement confirm_popup = driver.findElement(By.id("confirmButton"));
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView();", confirm_popup);
         confirm_popup.click();
         
           Alert confirm_alert = driver.switchTo().alert();
           Thread.sleep(3000);
            confirm_alert.dismiss();
            
            Thread.sleep(3000);
            driver.findElement(By.id("promtButton")).click();
            Alert   promt_alert= driver.switchTo().alert();
            promt_alert.sendKeys("java");
            System.out.println(promt_alert.getText());
            promt_alert.accept();
            
            //driver.close();
            
            
            
            
            
            
            
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
