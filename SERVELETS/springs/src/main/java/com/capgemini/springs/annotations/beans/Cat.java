package com.capgemini.springs.annotations.beans;

import com.capgemini.springs.interfaces.Animal;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("1.Eat pedigree");
	}

	@Override
	public void walk() {
		System.out.println("2.Cat walking");		
	}

	@Override
	public void sound() {
		System.out.println("3.Make sound as meow meow");		
	}

}
