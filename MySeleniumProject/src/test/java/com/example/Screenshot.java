package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();  //in the place of "RemoteWebDriver" you can pass "ChromeDriver" or "WebDriver" also as a driver instance. 
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//File
//		File sourceFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");
		
		//Bytes
//		byte[] bytesArr = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(bytesArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
		
		//Base64
		String base64Code = driver.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64Code);
		File destFile = new File("./Screenshots/img1.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArr);
		fos.close();
		System.out.println("Screenshot saved successfully");
		
		
		
		
		driver.quit();

	}

}
