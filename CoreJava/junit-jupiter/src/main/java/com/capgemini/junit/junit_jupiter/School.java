package com.capgemini.junit.junit_jupiter;

import java.util.ArrayList;

public class School {
	
	private ArrayList<Student> al = new ArrayList<Student>();
	//To generate random number
	public Student registerstudent(Student student) {
		int rollNumber = al.size() + 1;
		student.setId(rollNumber);
		al.add(student);
		return student;
		
	}
	
	public Student search(int id) {
		Student res= null;
		for(Student s: al) {
			if(s.getId()==id) { 
			res =s;
			break;
			}
		} return res;
			
		}
	


}