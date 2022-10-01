package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMultiSelectKeyboardEvent {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/selectable/";	
		driver.get(url);

		//click on grid
		driver.findElement(By.id("demo-tab-grid")).click();

		WebElement one = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]"));
		WebElement four = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[1]"));
		WebElement two = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[2]"));
		WebElement five = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(one)
		.pause(2000)
		.click(four)
		.pause(2000)
		.click(two)
		.pause(2000)
		.click(five)
		.keyUp(Keys.CONTROL)
		.perform();


		driver.close();

	}

}
