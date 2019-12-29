package com.capgemini.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElement(By.xpath("//[@id=\"draggable\"]"));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action = new Actions(driver); 
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		WebElement drop = driver.findElement(By.xpath("//demo-frame"));
		action.dragAndDrop(drag, drop);
		
			
			
		
	}

}
