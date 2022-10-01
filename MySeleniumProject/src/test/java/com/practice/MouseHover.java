package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/";
		
		driver.get(url);
		
		Actions action = new Actions(driver);
		
		WebElement qaAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-4131\"]/a/span"));
		action.moveToElement(qaAutomation).perform();
//		driver.findElement(By.partialLinkText("Z Automation Training")).click();
//		driver.navigate().back();
//		action.moveToElement(qaAutomation).perform();
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();
		driver.findElement(By.partialLinkText("Registration Form")).click();

	}

}
