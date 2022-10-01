package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://nxtgenaiacademy.com/demo-site/";
		
		driver.get(url);
		
		String countryOne = "India";
		String countrySecond = "Japan";
		
		WebElement selectDropdown = driver.findElement(By.id("vfb-13-country"));
		if(selectDropdown.isDisplayed()) {
			System.out.println("Dropdown is Displayed");
			
			Select cDropDown = new Select(selectDropdown);
			
			//Select using visible text
			cDropDown.selectByVisibleText(countryOne);
			System.out.println("The selected drop down is "+countryOne);
			Thread.sleep(2000);
			//select using value
			cDropDown.selectByValue(countrySecond);
			System.out.println("The selected drop down is "+countrySecond);
			Thread.sleep(3000);
			//select by using index
			cDropDown.selectByIndex(23);
			
			
			
			
		}
		else {
			System.out.println("Dropdown is not Displayed");
		}

	}

}
