package com.example;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLodTimeout {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage(). timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.facebook.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
	    Duration duration = Duration.between(startTime, endTime);
	    System.out.println("PageLoad time: "+duration.toMillis() + "milli seconds");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
