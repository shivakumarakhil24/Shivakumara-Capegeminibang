package com.capgemini.junit.junit_jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorsTest {

	private Calculators calcultor=null;
	
	
	@BeforeEach
	public void createObect() {
		calcultor=new Calculators();
		
		
	}
	@Test
	public void subTest() {
		int s = calcultor.sub(10, 5);
		assertEquals(5, s);
	}

	@Test
	public void subTestForNeg() {
		int s = calcultor.sub(-10, 5);
		assertEquals(-15, s);
	}

	@Test
	public void add1Test() {
		int s = calcultor.add1(10, 5);
		assertEquals(15, s);
	}

	@Test
	public void divideTest() {
		int s = calcultor.divide(10, 5);
		assertEquals(2, s);
	}

	@Test
	public void divedbyZero() {
		assertThrows(ArithmeticException.class, () -> calcultor.divide(10, 0));

	}

	@Test
	public void modTest() {
		int s = calcultor.mod(10, 9);
		assertEquals(1, s);
	}

	@Test
	public void multiplyTest() {
		int s = calcultor.multiply(10, 5);
		assertEquals(50, s);
	}

	@Test
	public void multiplyForNegTest() {
		int s = calcultor.multiply(-10, -5);
		assertEquals(50, s);
	}

}
