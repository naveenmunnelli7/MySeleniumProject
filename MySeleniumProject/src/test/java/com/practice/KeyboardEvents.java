package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		String value = "selenium";
		
		driver.get(url);
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		
		//Method-1:  Using action class 
		
		action.moveToElement(searchBar)
		.keyDown(searchBar, Keys.SHIFT)
		.sendKeys(searchBar, value)
		.keyUp(searchBar, Keys.SHIFT)
		.pause(3000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		//Method-2: Using action interface
		
/*		Action seriesOfActions = action
				.moveToElement(searchBar)
				.keyDown(searchBar, Keys.SHIFT)
				.sendKeys(searchBar, value)
				.keyUp(searchBar, Keys.SHIFT)
				.pause(3000)
				.sendKeys(Keys.ENTER)
				.build();
		seriesOfActions.perform();    */
		

	}

}
