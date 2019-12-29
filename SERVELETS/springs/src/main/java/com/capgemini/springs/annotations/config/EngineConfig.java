package com.capgemini.springs.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springs.annotations.beans.Isuzu;
import com.capgemini.springs.annotations.beans.VolksWagon;
import com.capgemini.springs.interfaces.Engine;

@Configuration
public class EngineConfig {
	@Bean(name="isuzu")
	@Primary
	public Engine getEngine() {
		return new Isuzu();
	}
	@Bean(name="vw")
	public Engine getVW( ) {
		return new VolksWagon();
	}

}
