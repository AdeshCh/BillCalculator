package com.xibia.app.pojo.util;

import java.util.List;

import com.xibia.app.Ipojo.Item;
import com.xibia.app.pojo.Customer;

public class AppUtil {

	private static final String itemCatogary="Grocerry";
	
	public static double calculateBill(Customer customer){
		double groceriesAmount=0;
		double nonGroceriesAmount=0;
		List<Item> list=customer.getItemList();
		if(list.isEmpty()){
			System.out.println("you have not purchased any thing");
			return 0;
		}
		for(Item item:list){
			if(item.getItemCatogary().equals("Grocerry")){
				groceriesAmount=groceriesAmount+item.getItemPrice();
			}else{
				nonGroceriesAmount=nonGroceriesAmount+item.getItemPrice();
			}
			
		}
		double discountedBill=0;
			if (groceriesAmount>0){
			 discountedBill=GrocerryBillCalculator.calculateBillForGroceries(customer,groceriesAmount);
			}
			int overallDisc=(int) ((nonGroceriesAmount+discountedBill)/100);
			return (nonGroceriesAmount+discountedBill)-(5*overallDisc);
		
	}
}
