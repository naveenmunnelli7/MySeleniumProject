package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main Document
		Thread.sleep(3000);
		driver.switchTo().frame("frm1"); //frame1
		
		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent(); //Main document
		
		driver.switchTo().frame("frm2"); //frame2
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); //Main document
        driver.switchTo().frame("frm1"); //frame1
		
		courseName_dd.selectByVisibleText("Python");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); //Main document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		
		

	}

}
