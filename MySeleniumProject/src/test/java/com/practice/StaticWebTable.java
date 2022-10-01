package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/webtable/";
		driver.get(url);
		
		String startXpath = "//*/tbody/";

		//First Name
		WebElement firstName = driver.findElement(By.xpath(startXpath+"tr[1]/td[2]"));
		String firstNameValue = firstName.getText();
		System.out.println("Employer first name is "+firstNameValue);

		//Emp id
		WebElement empId = driver.findElement(By.xpath(startXpath+"tr[7]/td[2]"));
		String empIdValue = empId.getText();
		System.out.println("Employer Emp id is "+empIdValue);

		//Email Id
		WebElement emailId = driver.findElement(By.xpath(startXpath+"tr[9]/td[2]"));
		String emailIdValue = emailId.getText();
		System.out.println("Employer email id is "+emailIdValue);

		driver.close();
	}

}
