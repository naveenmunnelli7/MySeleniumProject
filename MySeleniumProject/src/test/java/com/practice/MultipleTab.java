package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTab {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);
		
		//Click on new Tab window button 
		driver.findElement(By.name("newbrowsertab453")).click();
		System.out.println("Child Tab is opened");
		//System.out.println(driver.getWindowHandles());
		
		//Get the windows Id
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		
		//Storing each window's id to respective variables
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		System.out.println("parent window id is "+parentWindow);
		System.out.println("parent window id is "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		
		//click the data science - child window 
		driver.findElement(By.xpath("//*[@id=\"menu-item-5287\"]/a/span")).click();
		
		//driver.quit();
		
		//close the child window
		driver.close();
		
		//Activate the parent window 
		driver.switchTo().window(parentWindow);
		driver.manage().window().maximize();
		
		//click on the HOME link
		driver.findElement(By.partialLinkText("HOME")).click();
		
		//close the parent window
		driver.close();

	}

}
