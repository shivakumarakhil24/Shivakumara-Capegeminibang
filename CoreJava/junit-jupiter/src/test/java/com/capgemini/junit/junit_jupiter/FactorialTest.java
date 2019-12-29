package com.capgemini.junit.junit_jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void factorialTest() {
		Factorial fact= new Factorial();
		int result=fact.fact(3);
		assertEquals(6, result);
	}
}
