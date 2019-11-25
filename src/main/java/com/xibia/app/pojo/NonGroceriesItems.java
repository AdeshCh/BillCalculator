package com.xibia.app.pojo;

import com.xibia.app.Ipojo.Item;

public class NonGroceriesItems implements Item {

	private String itemCatogary="NonGrocerry";
	private double itemPrice;
	
	
	public NonGroceriesItems(double itemPrice) {
		super();
		this.itemPrice = itemPrice;
	}

	public String getItemCatogary() {
		return this.itemCatogary;
	}

	public double getItemPrice() {
		return this.itemPrice;
	}

}
