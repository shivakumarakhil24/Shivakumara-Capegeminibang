package com.capgemini.encaptulation;

public class MainCar {
public static void main(String[] args) {
	Car c=new Car(10,"Duster");
	System.out.println("My car cost is  ->"+c.getCost());
	System.out.println("My Car is       ->"+c.getName());
}
}
