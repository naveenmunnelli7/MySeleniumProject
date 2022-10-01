package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NextgenAiDemoRegistrationForm {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/demo-site/";	
		driver.get(url);
		
		String firstName = "Naveen";
		String lastName  = "Munnelli";
		String streetAddress  = "Manyam vari palli(v), Atlur(m), Kadapa(dt), Andhra Pradesh-516227";
		String optionalAddress = "BC colony";
		String city = "Kadapa";
		String state = "Andhra Pradesh";
		String postal = "516227";
		String email = "naveenmunnelli7@gmail.com";
		String phoneNumber = "9010467349";
		String verificationNumber = "45";
		
		
		//First Name and Last Name
		driver.findElement(By.id("vfb-5")).sendKeys(firstName);
		driver.findElement(By.id("vfb-7")).sendKeys(lastName);
		
		//Gender
		WebElement gender = driver.findElement(By.id("vfb-8-1"));
		gender.click();
		
		//Address
		//Street Address
		driver.findElement(By.id("vfb-13-address")).sendKeys(streetAddress);
		
		//Optional Address
		driver.findElement(By.id("vfb-13-address-2")).sendKeys(optionalAddress);
		
		//City
		driver.findElement(By.id("vfb-13-city")).sendKeys(city);
		
		//State / Province / Region
		driver.findElement(By.id("vfb-13-state")).sendKeys(state);
		
		//Postal / Zip Code
		driver.findElement(By.id("vfb-13-zip")).sendKeys(postal);
		
		//Country
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		
		Select select = new Select(countryDropDown);
		select.selectByValue("India");
		
		//Email
		driver.findElement(By.id("vfb-14")).sendKeys(email);
		
		//Date
		driver.findElement(By.id("vfb-18")).click();
		driver.findElement(By.className("ui-state-default")).click();
		
		//Convenient Time
		WebElement hours = driver.findElement(By.id("vfb-16-hour"));
		Select select1 = new Select(hours);
		select1.selectByVisibleText("09");
		
		WebElement mins = driver.findElement(By.id("vfb-16-min"));
		Select select2 = new Select(mins);
		select2.selectByIndex(10);
		
		//Mobile number
		driver.findElement(By.id("vfb-19")).sendKeys(phoneNumber);
		
		//Course Interested
		WebElement checkBox = driver.findElement(By.id("vfb-20-2"));
		checkBox.click();
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-20-3"));
		checkBox1.click();
		
		WebElement checkBox2 = driver.findElement(By.id("vfb-20-0"));
		checkBox2.click();
		checkBox2.click();
		
		//Verification
		driver.findElement(By.id("vfb-3")).sendKeys(verificationNumber);
		
		
		//Submit 
		driver.findElement(By.id("vfb-4")).click();
		
				
		


	}

}
