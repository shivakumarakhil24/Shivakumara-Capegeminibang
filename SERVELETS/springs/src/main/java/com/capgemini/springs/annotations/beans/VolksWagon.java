package com.capgemini.springs.annotations.beans;

import com.capgemini.springs.interfaces.Engine;

public class VolksWagon implements Engine {

	@Override
	public int getCC() {
		return 1800;
	}

	@Override
	public String getType() {
		return "BS-5";
	}
	

}
