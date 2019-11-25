package com.xibia.app.pojo.enums;

public enum DiscountEnums {

	isStaff(30),isAffiliate(10),isOld(5);
	
	DiscountEnums(int disPercentage){
		this.disPercentage=disPercentage;
	}
	private final double disPercentage;
	
	public double getDisPercentage() {
		return disPercentage;
	}
	
}
