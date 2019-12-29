package com.capgemini.springs.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springs.annotations.beans.Cat;
import com.capgemini.springs.annotations.beans.Dog;

@Configuration
public class AnimalConfig {

	@Bean(name = "dog")
	@Primary
	public Dog getDog() {
		return new Dog();

	}

	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}

}
