package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/buttons";
		
		driver.get(url);
		
		WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
		
		Actions actions  = new Actions(driver);
		//Method -1      doubleClick()
		//actions.doubleClick(doubleClickMe).perform();
		System.out.println("Button is Double clicked");
		
		//Method-2   moveToElement()
		actions.moveToElement(doubleClickMe).doubleClick().perform();

	}

}
