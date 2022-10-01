package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMaximization {

	public static void main(String[] args) {
		
		//Way1-Chrome
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		
		//Way1-Firefox
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");


		//Way1-Edge
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		
		//Way2-Chrome
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		
		//Way2-Edge
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("start-maximized");
//		WebDriver driver = new EdgeDriver(options);
//		driver.get("https://www.google.co.in/");

		
		

	}

}
