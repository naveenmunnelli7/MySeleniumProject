package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//TagName, HTML Attribute Value, Text, CSS value

public class WebElementProperties {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
//		System.out.println(driver.findElement(By.name("commit")).getTagName());
		
//	    System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		
//		WebElement usernameTxt = driver.findElement(By.id("login_field"));
//		usernameTxt.sendKeys("test@gmail.com");
//		System.out.println(usernameTxt.getAttribute("value"));
		
//		System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());
		
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		driver.close();
		

	}

}
