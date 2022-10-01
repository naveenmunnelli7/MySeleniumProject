package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveAllLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/python/";
		driver.get(url);
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		//Print all the link
		for(WebElement link:allLink) {
			System.out.println(link.getText() +"_ "+link.getAttribute("href"));
		}
		
		driver.close();

	}

}
