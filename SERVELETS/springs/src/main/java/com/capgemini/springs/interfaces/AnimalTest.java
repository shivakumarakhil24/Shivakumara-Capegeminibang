package com.capgemini.springs.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springs.beans.Pet;

public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("petConfig.xml");
		Pet myPet = context.getBean("pet",Pet.class);
		
		myPet.getAnimal().eat();
		myPet.getAnimal().walk();
		myPet.getAnimal().sound();
		
		
	}

}
