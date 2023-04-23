package com.selenium_miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		
//		 WebElement findElement4 = driver.findElement(By.id(""));
//	        Select s=new Select(findElement4);
//	        s.selectByVisibleText("");
//	        Thread.sleep(1000);

		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Workspace\\Selenium_Trainings\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("6383669620");
		Thread.sleep(1000);
        WebElement findElement2 = driver.findElement(By.id("password"));
        findElement2.sendKeys("L108E0");
        Thread.sleep(1000);
        WebElement findElement3 = driver.findElement(By.id("login"));
        findElement3.click();
         Thread.sleep(1000);
        WebElement findElement4 = driver.findElement(By.id("location"));
        Select s=new Select(findElement4);
        s.selectByVisibleText("London");
        Thread.sleep(1000);
        WebElement findElement5 = driver.findElement(By.id("hotels"));
        Select s1=new Select(findElement5);
        s1.selectByVisibleText("Hotel Sunshine");
        Thread.sleep(1000);
        WebElement findElement6 = driver.findElement(By.id("room_type"));
        Select s2=new Select(findElement6);
        s2.selectByVisibleText("Standard");
        Thread.sleep(1000);
        WebElement findElement7 = driver.findElement(By.id("room_nos"));
        Select s3=new Select(findElement7);
        s3.selectByVisibleText("3 - Three");
        Thread.sleep(1000);
        WebElement findElement8 = driver.findElement(By.id("datepick_in"));
        findElement8.clear();
		findElement8.sendKeys("11/03/2023");
		Thread.sleep(1000);
		WebElement findElement9 = driver.findElement(By.id("datepick_out"));
		findElement9.clear();
		findElement9.sendKeys("12/03/2023");
		Thread.sleep(1000);
		WebElement findElement10 = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(findElement10);
		s4.selectByVisibleText("2 - Two");
		Thread.sleep(1000);
		WebElement findElement11 = driver.findElement(By.id("child_room"));
		Select s5 = new Select(findElement11);
		s5.selectByVisibleText("0 - None");
		Thread.sleep(1000);
		 WebElement findElement12 = driver.findElement(By.id("Submit"));
		findElement12.click();
		Thread.sleep(1000);
		 WebElement findElement13 = driver.findElement(By.id("radiobutton_0"));
		findElement13.click();
		Thread.sleep(1000);
		WebElement findElement14 = driver.findElement(By.id("continue"));
		findElement14.click();
		Thread.sleep(1000);
		WebElement findElement15 = driver.findElement(By.id("first_name"));
		findElement15.sendKeys("R");
		Thread.sleep(1000);
		WebElement findElement16 = driver.findElement(By.id("last_name"));
		findElement16.sendKeys("sivakumar");
		Thread.sleep(1000);
		WebElement findElement17 = driver.findElement(By.id("address"));
		findElement17.sendKeys("kasipalayam");
		Thread.sleep(1000);
		WebElement findElement18 = driver.findElement(By.id("cc_num"));
		findElement18.sendKeys("5312924814535312");
		Thread.sleep(1000);
		WebElement findElement19 = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(findElement19);
		s6.selectByVisibleText("Other");
		Thread.sleep(1000);
		WebElement findElement20 = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(findElement20);
		s7.selectByVisibleText("September");
		Thread.sleep(1000);
		WebElement findElement21 = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(findElement21);
		s8.selectByVisibleText("2022");
		Thread.sleep(1000);
		WebElement findElement22 = driver.findElement(By.id("cc_cvv"));
		findElement22.sendKeys("2525");
		Thread.sleep(1000);
		WebElement findElement23 = driver.findElement(By.id("book_now"));
		findElement23.click();
		

		
			
		
        
	}

}
