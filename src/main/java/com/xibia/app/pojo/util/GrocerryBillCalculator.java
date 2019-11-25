package com.xibia.app.pojo.util;

import java.time.LocalDate;
import java.time.Period;

import com.xibia.app.pojo.Customer;
import com.xibia.app.pojo.enums.DiscountEnums;

public class GrocerryBillCalculator {
	
	
	static double calculateBillForGroceries(Customer customer,double billAmount){
		if(customer.isStaff()){
			return (billAmount-(billAmount*(DiscountEnums.isStaff.getDisPercentage()/100)));
		}
		if(customer.isAffiliate()){
			return (billAmount-(billAmount*(DiscountEnums.isAffiliate.getDisPercentage()/100)));
		}
		if(isOldCustomer(customer.getCustomerSince())){
			return (billAmount-(billAmount*(DiscountEnums.isOld.getDisPercentage()/100)));
		}
		
		return 0;
	}

	private static boolean isOldCustomer(String customerSince) {
		String[] date=customerSince.split("-");
		LocalDate doj=LocalDate.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]),Integer.valueOf(date[0]));
		LocalDate tod=LocalDate.now();
		Period p=Period.between(doj, tod);
		if((p.getYears()>=2))
		return true;
		
		return false;
	}
	public static void main(String[] args) {
		double d=1234.098;
		int i=(int) (d/100);
		System.out.println(i);
	}
}
