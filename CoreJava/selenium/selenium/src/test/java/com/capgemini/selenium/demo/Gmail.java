package com.capgemini.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("shivakumara.s2427@gmail.com");
		driver.findElement(By.name("password")).sendKeys("8722551183");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("raj8805"); 

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

        WebDriverWait wait=new WebDriverWait(driver, 20);               

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();         

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");             

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 

		
		
	}

}
