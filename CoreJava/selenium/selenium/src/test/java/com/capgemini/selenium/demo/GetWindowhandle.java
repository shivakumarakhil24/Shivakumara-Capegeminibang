package com.capgemini.selenium.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		String wh= driver.getWindowHandle();
		System.out.println(wh);
		
		driver.get("http:/www.noukri.com/");
		Set<String> whs= driver.getWindowHandles();
		System.out.println("number of windows:"+whs.size());
		System.out.println(whs);
		driver.quit();
	}

}
