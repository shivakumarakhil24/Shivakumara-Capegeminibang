package com.capgemini.junit.junit_jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school;

	@BeforeEach
	public void createObject() {
		school = new School();
	}

	@Test
	public void testRegisterStudent() {
		Student student = new Student("Dimple", 78.8, 'F');
		Student stu = school.registerstudent(student);
		assertEquals(1, stu.getId());
	}
	
	@Test
	public void testRegisterForNull() {
		assertThrows(NullPointerException.class, ()->school.registerstudent(null));
	}
}
