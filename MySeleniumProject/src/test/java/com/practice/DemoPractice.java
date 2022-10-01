package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPractice {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://nxtgenaiacademy.com/demo-site/";
		
		driver.get(url);
		driver.findElement(By.id("vfb-5")).sendKeys("Naveen");
		driver.findElement(By.id("vfb-7")).sendKeys("Munnelli");
		
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Kadapa");
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("Badvel");
		
		driver.findElement(By.xpath("//input[@name='vfb-13[zip]']")).sendKeys("Bangalore");
		
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("naveen14318@gmail.com");
		
		
		
		//driver.findElement(By.partialLinkText("PYTHON FOR DA")).click();
		
		//driver.findElement(By.linkText("HOME")).click();
	}

}
