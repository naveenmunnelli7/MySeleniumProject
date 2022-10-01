package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBoxes {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/alertandpopup/";	
		driver.get(url);
		
		//Handling alert box
		WebElement alertBox = driver.findElement(By.name("alertbox"));
		alertBox.click();
		//capture the message 
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Handling Confirm alert box
		WebElement confirmAlertBox = driver.findElement(By.name("confirmalertbox"));
		confirmAlertBox.click();
		//capture the message 
		String confirmAlertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(confirmAlertBoxMsg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		confirmAlertBox.click();
		driver.switchTo().alert().dismiss();
		
		//Handling Prompt alert box
		WebElement promptAlertBox = driver.findElement(By.name("promptalertbox1234"));
		promptAlertBox.click();
		//capture the message 
		String promptAlertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(promptAlertBoxMsg);
		driver.switchTo().alert().sendKeys("Yes");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		promptAlertBox.click();
		driver.switchTo().alert().sendKeys("No");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		promptAlertBox.click();
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
