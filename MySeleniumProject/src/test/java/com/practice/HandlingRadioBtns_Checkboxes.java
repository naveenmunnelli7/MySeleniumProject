package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioBtns_Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
//		WebElement RadioBtn = driver.findElement(By.id("vfb-8-1"));
//
//		//isDisplayed
//		if(RadioBtn.isDisplayed()) {
//			System.out.println("Radio button is displayed");
//
//		}
//		else {
//			System.out.println("Radio button is not displayed");
//
//		}
//		//isEnabled
//		if (RadioBtn.isEnabled()) {
//			System.out.println("Radio button is enabled");
//		}
//		else {
//			System.out.println("Radio button is not enabled");
//
//		}
//		//isSelected
//		if (RadioBtn.isSelected()) {
//
//			System.out.println("Radio button is selected");
//		}
//		else {
//			System.out.println("Radio button is not selected");
//			RadioBtn.click();
//		}
//
//		//Verify select or not 
//		if (RadioBtn.isSelected()) {
//			System.out.println("Radio button is selected");
//		}
//		else {
//			System.out.println("Radio button is not selected");
//
//		}
		
		System.out.println("----------------------------------------");
		
		WebElement TestNGTestbox = driver.findElement(By.xpath("//input[@value='TestNG']"));
		
//		if(TestNGTestbox.isDisplayed()) {
//			System.out.println("Checkbox is displayed");
//		}
//		else {
//			System.out.println("Checkbox is not displayed");
//		}
//		
//		if(TestNGTestbox.isEnabled()) {
//			System.out.println("Checkbox is Enabled");
//		}
//		else {
//			System.out.println("Checkbox is not Enabled");
//		}
		
		if(TestNGTestbox.isSelected()) {
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			TestNGTestbox.click();
			System.out.println("Checkbox is checked");
		}
		Thread.sleep(3000);
		TestNGTestbox.click();
		System.out.println("Checkbox is Unchecked");
		
		
		//CoreJava checkbox
		WebElement coreJava = driver.findElement(By.id("vfb-20-3"));
		
		if(coreJava.isSelected()) {
			System.out.println(" coreJavCheckbox is selected");
		}
		else {
			System.out.println("coreJava Checkbox is not selected");
			coreJava.click();
			System.out.println(" coreJava Checkbox is checked");
		}
		Thread.sleep(3000);
		coreJava.click();
		System.out.println("coreJava Checkbox is Unchecked");
		
		//driver.quit();
		
		


	}

}
