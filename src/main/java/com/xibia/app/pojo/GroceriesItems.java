package com.xibia.app.pojo;

import com.xibia.app.Ipojo.Item;

public class GroceriesItems implements Item {

	private String itemCatogary="Grocerry";
	private double itemPrice;
	
	
	public GroceriesItems(double itemPrice) {
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
