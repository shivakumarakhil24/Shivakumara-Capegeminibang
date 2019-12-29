package com.capgemini.selenium.login;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.selenium_test2.Calculator;


public class CalculatorTest  {
	Calculator cal=new Calculator();
	@Test
	public void addTest() {
		int a=20;
		int b=20;
		int expected= 40;
		int actual= cal.add(a,b);
		Assert.assertEquals(expected,actual);
	}

}
