package com.capgemini.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
		
		  driver.manage().window().maximize();
		  driver.navigate().to("http://www.google.com/"); driver.navigate().back();
//		  String title = driver.get
		 
	}

}