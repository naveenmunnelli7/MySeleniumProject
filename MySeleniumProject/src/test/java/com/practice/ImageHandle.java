package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://nxtgenaiacademy.com/demo-site/";
		
		driver.get(url);
		
		//Robot image
		WebElement RobotImg = driver.findElement(By.xpath("//img[@class='attachment-large size-large']"));
		if (RobotImg.isDisplayed()) {
			System.out.println("Robot image is displayed"); 
			/*System.out.println(RobotImg.getAttribute("alt"));
			System.out.println(RobotImg.getAttribute("loading"));
			System.out.println(RobotImg.getAttribute("class")); */
			String RobotTxt = RobotImg.getAttribute("alt");
			System.out.println("The text of the robot image is "+RobotTxt);
		}
		else
		{
			System.out.println("Robot image is not displayed");
		}
		
		System.out.println("---------------------------------");
		
		//Logo image
		WebElement LogoImg = driver.findElement(By.xpath("//*[@id=\"site-logo-inner\"]/a/img"));
		if (RobotImg.isDisplayed()) {
			System.out.println("Logo image is displayed");
			String LogoTxt = LogoImg.getAttribute("alt");
			System.out.println("The text of the logo image is "+LogoTxt);
		}
		else {
			System.out.println("Logo image is not displayed");
		}
		driver.quit();

	}

}
