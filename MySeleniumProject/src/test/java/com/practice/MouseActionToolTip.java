package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionToolTip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		
		driver.get(url);
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		 
		
		Actions actions = new Actions(driver);
		actions.moveToElement(googleSearchBox).perform();
		
		//validate the tool tip message
		String actMsg = googleSearchBox.getAttribute("title");
		String expMsg = "Search";
		
		if(actMsg.equals(expMsg)) {
			System.out.println("both actual and expected messages are same ");
			System.out.println("The message is "+actMsg);
		}
		else {
			System.out.println("both actual and expected messages are not same ");
			System.out.println("The actual message is "+actMsg);
			System.out.println("The expected message is "+expMsg);
		}

	}

}
