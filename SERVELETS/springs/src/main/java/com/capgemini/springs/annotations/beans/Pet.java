package com.capgemini.springs.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springs.interfaces.Animal;

public class Pet {

	private String name;
	@Autowired
	private Animal animal;

//Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
