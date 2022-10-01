package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/webtable/";
		
		driver.get(url);
		
		
		//Programming knowledge
		WebElement multiSelect = driver.findElement(By.name("programming"));
		if(multiSelect.isDisplayed()) {
			
			Select languages = new Select(multiSelect);
			languages.selectByVisibleText("Java");
			languages.selectByVisibleText("Python");
			Thread.sleep(3000);
			languages.selectByValue("JAVASCRIPT");
			
			languages.selectByIndex(5);
			Thread.sleep(3000);
			languages.deselectByVisibleText("Python");
			Thread.sleep(3000);
			languages.deselectAll();
			
		}
		else {
			System.out.println("Programming knowledge is not displayed");
		}
		
	}

}
