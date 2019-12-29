package com.capgemini.springs.interfaces;

public class Dog implements Animal {

	@Override
	public void eat() {
		
		System.out.println("1.Eat All veg and non veg things");
	}

	@Override
	public void walk() {
		System.out.println("2.Dog is walking");
	}

	@Override
	public void sound() {
		System.out.println("3.make sound as Bow Bow");
	}

}
