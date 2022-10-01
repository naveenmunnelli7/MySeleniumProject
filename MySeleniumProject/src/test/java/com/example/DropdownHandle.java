package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseNameDropdown = new Select(courseElement);
//		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
//		for (WebElement option : courseNameDropdownOptions) {
//			System.out.println(option.getText());
//		}
//		courseNameDropdown.selectByIndex(1);  //java
//		Thread.sleep(3000);
//		courseNameDropdown.selectByValue("net");  //Dot net
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("Javascript");  //java script
//		Thread.sleep(3000);
//		String selectedTxt = courseNameDropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected visible text: " + selectedTxt);
// 	
	
	WebElement ideElement = driver.findElement(By.id("ide"));
	Select ideDropdown = new Select(ideElement);
	List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
	for (WebElement option : ideDropdownOptions) {
		System.out.println(option.getText());
	}
	ideDropdown.selectByIndex(0);  //Eclipse
	Thread.sleep(3000);
	ideDropdown.selectByValue("ij");  //IntelliJ IDEA
	Thread.sleep(3000);
	ideDropdown.selectByVisibleText("NetBeans");  //NetBeans
	Thread.sleep(3000);
	
	ideDropdown.deselectByVisibleText("IntelliJ IDEA");
	
	List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
	for (WebElement selectedOption : selectedOptions) {
		System.out.println("Selected visible text: " + selectedOption.getText());
	}
	
	
	
	
	}

}
