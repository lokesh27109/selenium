package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search_cagetory = driver.findElement(By.id("searchDropdownBox"));
		System.out.println("Hi");
		Select s = new Select(search_cagetory);
		
	     
	     s.isMultiple();
	     System.out.println(s.isMultiple());
	     
	     s.selectByValue("search-alias=amazon-pharmacy");

	     driver.navigate().to("https://demoqa.com/select-menu");
	     Thread.sleep(3000);
	     
	        WebElement all_cars = driver.findElement(By.id("cars"));
	     
	     Select s1 = new Select(all_cars);
	     System.out.println(s1.isMultiple());
	     
	     s1.selectByVisibleText("Saab");
	     s1.selectByIndex(1);
	     
	     System.out.println("================================");
	     
	     List<WebElement> options = s1.getOptions();

	     for (WebElement webElement : options) {
			
	    	 System.out.println(webElement.getText());
		}
	     
	     System.out.println("===================================="); 
	     
	    	 List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	    	 
	    	 for (WebElement webElement : allSelectedOptions) {
				
	    		 System.out.println(webElement.getText());
			}
			
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
	     
	     System.out.println(firstSelectedOption.getText());
	     
	     Thread.sleep(3000);
	     
	     s1.deselectAll();
	     
	     Thread.sleep(3000);
	    driver.close();
	     
	     
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
