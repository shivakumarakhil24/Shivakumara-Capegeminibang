package com.capgemini.springs.annotations.beans;

import com.capgemini.springs.interfaces.Engine;

public final class Isuzu implements Engine {

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "4 Stroke petrol";
	}

}
