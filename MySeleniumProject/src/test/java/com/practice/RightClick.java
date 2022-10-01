package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		
		WebElement rightClickMe = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement deleteOption = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		
		Actions action = new Actions(driver);
		
		//Perform Right click
//		action.contextClick(rightClickMe).perform();
//		action.contextClick(deleteOption).perform();
		
		//or
//		action.contextClick(rightClickMe)
//		.pause(3000)
//		.click(deleteOption)
//		.perform();
		
		//or
		action.contextClick(rightClickMe).click(deleteOption).perform();
		
		//click on OK
		driver.switchTo().alert().accept();

	}

}
