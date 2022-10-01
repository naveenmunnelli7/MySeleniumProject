package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(3000);
		
//		int day = 1;
		
//		//First Calendar
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		
		//Second Calendar
//		driver.findElement(By.id("second_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();

		
//		String targetDate = "15/Jul/2022";
//		Calendar calendar = Calendar.getInstance();
//		
//		try {
//			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
//			targetDateFormat.setLenient(false);
//			Date formattedTargetDate = targetDateFormat.parse(targetDate);
//			calendar.setTime(formattedTargetDate);
//		}catch (ParseException e) {
//				throw new Exception("Invalid date is provided, please check the input date!!");
//				
//			}
//			int targetMonth = calendar.get(Calendar.MONTH);
//			int targetYear = calendar.get(Calendar.YEAR);
//			int targetDay = calendar.get(calendar.DAY_OF_MONTH);
//			
//			driver.findElement(By.id("first_date_picker")).click();
//			
//			//March 2022
//			String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();	
//			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
//			int currentMonth = calendar.get(Calendar.MONTH);
//			int currentYear = calendar.get(Calendar.YEAR);
//			
//			while(currentMonth < targetMonth || currentYear < targetYear) {
//				driver.findElement(By.className("ui-datepicker-next")).click();
//				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();	
//				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
//				currentMonth = calendar.get(Calendar.MONTH);
//				currentYear = calendar.get(Calendar.YEAR);
//			}
//			if(currentMonth == targetMonth && currentYear == targetYear)
//				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
//			else
//				throw new Exception("unable to select the date because of current and target dates mismatch");
//			
//		
//		
	}

}
