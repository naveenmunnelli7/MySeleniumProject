package com.example;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTimeout {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10, 500);
		
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofSeconds(10));
		
		driver.get("https://testproject.io/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				
				Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {	
					public Boolean apply(WebDriver webDriver) {
						return webDriver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
					}
				};
				wait.until(f);
				
				
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Naveen");
			}
		}

		
	}

}
