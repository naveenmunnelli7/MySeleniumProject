package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveDropdownValues {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		
		WebElement countryDropdown = driver.findElement(By.id("vfb-13-country"));
		Select cDropdown = new Select(countryDropdown);
		List<WebElement> values = cDropdown.getOptions();
		
		int ddCount = values.size();
		for(int i=0;i<ddCount;i++) {
			String options = values.get(i).getText();
			System.out.println(options);
			
		}
		driver.close();

	}

}
