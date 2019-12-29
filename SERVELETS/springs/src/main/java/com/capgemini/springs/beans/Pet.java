package com.capgemini.springs.beans;

import com.capgemini.springs.interfaces.Animal;

public class Pet {
	public String name;
	public Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
