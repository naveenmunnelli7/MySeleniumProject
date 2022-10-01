package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitProgressBar {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/progress-bar";		
		driver.get(url);

		//Click on start button
		driver.findElement(By.id("startStopButton")).click();

		//Declaring the rest button WebElement
		WebElement reset;

		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Fluent wait is implememented. Increase the timeout duration")
				.ignoring(NoSuchElementException.class);
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		
		//Click on reset button
		reset.click();
		System.out.println("Reset button is clicked");
	}

}
