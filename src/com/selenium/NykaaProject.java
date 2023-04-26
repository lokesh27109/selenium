package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NykaaProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumProject1\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		
		 WebDriver driver = new ChromeDriver(ch);
	     driver.manage().window().maximize();
	     driver.get("https://www.nykaa.com/");
	     
	     
	     Thread.sleep(3000);
	     
	       Actions a = new Actions(driver);

WebElement mom_action = driver.findElement(By.xpath("//a[text()='mom & baby']"));
		a.moveToElement(mom_action).build().perform();
		
WebElement baby_powder = driver.findElement(By.xpath("//a[text()='Baby Powder']"));		
		a.click(baby_powder).build().perform();
		
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		Iterator<String> itr = windowHandles.iterator();
		String first_window = itr.next();
		System.out.println(first_window);
		Thread.sleep(3000);

		String second_window = itr.next();
		System.out.println(second_window);
		driver.switchTo().window(second_window);
	  Thread.sleep(3000);

	  
		WebElement himalya_powder = driver.findElement(By.xpath("//div[text()='Himalaya Baby Powder']"));
		himalya_powder.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		
        
		
		for (String third_window : windowHandles2) {
			System.out.println(third_window);
			driver.switchTo().window(third_window);
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement himalaya = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
        Select s = new Select(himalaya);
        
        s.isMultiple();
        System.out.println(s.isMultiple());
        
        s.selectByIndex(3);
  	  Thread.sleep(3000);
  	  

        
        WebElement add_to_bag = driver.findElement(By.xpath("//span[@class='btn-text']//parent::button[@type='button'][1]"));
        add_to_bag.click();
        
        
     	  WebElement click_the_bag = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
     	 click_the_bag.click();

        
  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	
  		Thread.sleep(10000);

  		WebElement quan = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
  		driver.switchTo().frame(quan);
  		Thread.sleep(3000);
         WebElement select_quanity = driver.findElement(By.xpath("//span[@class='css-1aowomc ehes2bo0']//ancestor::div[@class='css-1ppri07 epdmlj41']"));
         select_quanity.click();

        
		WebElement quanity3 = driver.findElement(By.xpath("//div[@value='3']//parent::li"));
		quanity3.click();
		
  		Thread.sleep(5000);

		
		WebElement proceed = driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d7']"));
		proceed.click();
		
		WebElement login = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		login.click();
		
		WebElement click_emailid = driver.findElement(By.xpath("//div[@class='form-field-plain login-wrap']"));
		click_emailid.click();
		
		WebElement e_mail = driver.findElement(By.name("emailMobile"));
		e_mail.sendKeys("saranyaraju2000@gmail.com");
		
		WebElement submit_verification = driver.findElement(By.id("submitVerification"));
		submit_verification.click();
		
		WebElement send_otp = driver.findElement(By.xpath("//button[@class='button big full small-button-seperator']"));
		send_otp.click();
		
		Thread.sleep(10000);
		
		
		WebElement verify = driver.findElement(By.xpath("//button[@class='button big fill full ']"));
		verify.click();
		
		Thread.sleep(5000);

             WebElement delivery_here = driver.findElement(By.xpath("//div[@class='css-70xe38 e14b3ylv5']"));
             delivery_here.click();

		WebElement atm_card = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		atm_card.sendKeys("4012 8888 8888 1881");
		
	WebElement expire_date = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
	expire_date.sendKeys("10/26");
		
		WebElement cv_no = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cv_no.sendKeys("078");
		
	    Thread.sleep(5000);

	
		WebElement pay = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		pay.click();	
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\dell\\eclipse-workspace\\SeleniumTesting\\screenshots\\s1.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(5000);
    
		WebElement item_click = driver.findElement(By.xpath("//img[@src='https://adn-static1.nykaa.com/media/wysiwyg/Payments/down.svg']//parent::span[1]"));
		item_click.click();
		
		WebElement click_edit = driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']"));
		click_edit.click();
		
		WebElement remove_product = driver.findElement(By.xpath("//div[@data-test-id='product-remove'][1]"));
		remove_product.click();
		
		WebElement delete_product = driver.findElement(By.xpath("//button[@class='css-110s749 e8tshxd1']//parent::div[1]"));
		
		delete_product.click();
		
		
		
		
		

	}

}
