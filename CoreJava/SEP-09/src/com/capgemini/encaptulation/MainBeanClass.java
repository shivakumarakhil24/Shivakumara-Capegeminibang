package com.capgemini.encaptulation;

public class MainBeanClass {

	public static void main(String[] args) {
		BeanClass bc=new BeanClass();
		bc.setId(1234);
		bc.setHt(5.67);
		bc.setName("Ankith");
		BeanDataBase bdb=new BeanDataBase();
		bdb.recieve(bc);
		
		
	}
}
