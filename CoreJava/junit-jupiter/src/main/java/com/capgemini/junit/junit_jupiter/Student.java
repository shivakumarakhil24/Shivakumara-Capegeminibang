package com.capgemini.junit.junit_jupiter;

public class Student {
	private int id;
	private String name;
	private double percentage;
	private char gender;

//Default constructor
	public Student() {

	}

//Parameterised Constructor
	public Student(String name, double percentage, char gender) {
		super();

		this.name = name;
		this.percentage = percentage;
		this.gender = gender;
	}

//Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
