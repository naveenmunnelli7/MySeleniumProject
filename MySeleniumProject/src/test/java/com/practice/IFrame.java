package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
        driver.get(url);
        
        /*
         * Frame names
         * packageListFrame - 0 
         * packageFrame - 1
         * classFrame - 2
         */
        
        //validate the List frame 
        driver.switchTo().frame("packageListFrame");
        
        
        //click on the org.openqa.selenium.chrome
        driver.findElement(By.xpath("/html/body/main/ul/li[2]/a")).click();
        System.out.println("selenium.chorme link is clicked");
        
        //mandatory step- switch back to default content
        driver.switchTo().defaultContent();
        
        //validate the packageFrame
        driver.switchTo().frame("packageFrame");
        
        //click on ChromeOptions
        driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
        System.out.println("chormeOptions link is clicked");
        
        //mandatory step- switch back to default content
        driver.switchTo().defaultContent();
        
        //validate the classFrame
        driver.switchTo().frame("classFrame");
        
        //click on Help
        driver.findElement(By.linkText("HELP")).click();
        System.out.println("Help link is clicked");
        

	}

}
