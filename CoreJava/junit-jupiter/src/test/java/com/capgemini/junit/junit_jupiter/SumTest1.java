package com.capgemini.junit.junit_jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest1 {
	@Test
	public void addTest() {
		Sum s = new Sum();
		int i = s.add(10, 15);
		assertEquals(25, i);

	}
}
