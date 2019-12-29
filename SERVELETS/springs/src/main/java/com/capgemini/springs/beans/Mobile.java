package com.capgemini.springs.beans;

public class Mobile {
	private String brandName;
	private String modelName;
	private int price;
	private MobileDisplay mDisplay;

//getter and setter
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MobileDisplay getmDisplay() {
		return mDisplay;
	}

	public void setmDisplay(MobileDisplay mDisplay) {
		this.mDisplay = mDisplay;
	}

}
