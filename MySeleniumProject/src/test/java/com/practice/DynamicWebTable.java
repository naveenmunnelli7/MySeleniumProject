package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://money.rediff.com/gainers/bse/daily/groupa";
		driver.get(url);

		String companyName = "Matrimony.com";

		//Identify the table
		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));

		//to locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));

		//Find the total count of the rows
		int rowCount = rowsTable.size();
		//System.out.println(rowCount);

		//for loop- loop will be executed till the last the last row of the table
		outerloop:
		for (int row=0;row<rowCount;row++) {
			//to locate the columns of the specified row
			List<WebElement> columnsRow = rowsTable.get(row).findElements(By.tagName("td"));
			int colCount = columnsRow.size();
			//System.out.println(colCount);

			//Nested for loop - loop will be executed till the last column of the table 
			for(int col=0;col<colCount;col++) {

				String cellText = columnsRow.get(col).getText();
				//System.out.println(cellText);

				//Retrieving the company details based upon the company name 	
				if (cellText.equals(companyName)) {
					//company name
					WebElement CompanyNameObj = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[1]/a"));
					String companyNameValue = CompanyNameObj.getText();
					System.out.println("The company name is "+companyNameValue);
					
					//Group
					String group = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[2]")).getText();
					System.out.println("The group name is "+group);
					
					//previous price
					String prevPrice = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[3]")).getText();
					System.out.println("The previous price is "+prevPrice);	
					//current price
					String CurPrice = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[4]")).getText();
					System.out.println("The current price is "+CurPrice);
					//% price
					String perPrice = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[5]")).getText();
					System.out.println("The % price is "+perPrice);
					
					//click on the company name
					CompanyNameObj.click();
					
					break outerloop;



				}

			}

		}

	}

}
