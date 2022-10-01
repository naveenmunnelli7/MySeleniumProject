package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Syntax to authenticate
		//String url = https://username:password@the-internet..............
		
		String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		
		driver.get(url);
		
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
		
		//Validating the successful msg
		String actGreetMsg = msg.getText();
		String expGreetMsg = "Congratulations! You must have the proper credentials.";
		
		if(actGreetMsg.equals(expGreetMsg)) {
			System.out.println("Both actual msg and exp msg are Same ");
			System.out.println("The greeting message is "+actGreetMsg);
		}
		else {
			System.out.println("Both actual msg and exp msg are not Same ");
			System.out.println("The Actual greeting message is "+actGreetMsg);
			System.out.println("The expected greeting message is "+expGreetMsg);
		

	}
		
		driver.close();

}
}
