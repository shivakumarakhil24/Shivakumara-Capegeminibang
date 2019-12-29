package com.capgemini.springs.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springs.interfaces.Engine;

public class Car {

	private int modelName;
	private String modelNum;
	@Autowired
	private Engine engine;

	public int getModelName() {
		return modelName;
	}

	public void setModelName(int modelName) {
		this.modelName = modelName;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
