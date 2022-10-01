package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.makemytrip.com";
		driver.get(url);
		String year = "2023";
		String month = "March";
		String day = "13";
		
		//click on calendar link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		
		//click on next button
		WebElement next = driver.findElement(By.xpath("//*[@aria-label='Next Month']"));
		
		//Retrieving the month and year text
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		
		String currentYear = date.getText();
		System.out.println(currentYear);
		
		//click the next arrow until we get the desired year
		if(!currentYear.contains(year)) {
			do {
				next.click();
			}while(!date.getText().contains(year));
		}
		System.out.println("The year selected is "+year);
		
		
		//Click on the next arrow until get the desired month
		String currentMonth = date.getText();
		if(!currentMonth.contains(month)) {
			do {
				next.click();
			}while(!date.getText().contains(month));
		}
		System.out.println("The month selected is "+month);
		
		//Select the day 
		WebElement selectDay = driver.findElement(By.xpath("//p[contains(text(),'"+day+"')]"));
		selectDay.click();
		System.out.println("The selected day is "+day);

	}

}
