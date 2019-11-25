package com.xibia.app.application;

import java.util.ArrayList;
import java.util.List;

import com.xibia.app.Ipojo.Item;
import com.xibia.app.pojo.Customer;
import com.xibia.app.pojo.GroceriesItems;
import com.xibia.app.pojo.NonGroceriesItems;
import com.xibia.app.pojo.util.AppUtil;

public class BillCalculatorApp {
	
public static void main(String[] args) {
	
	//Customer Details
	Customer.CustomerBuilder customer= new Customer.CustomerBuilder();
	customer.setMobileNo("8585857474");
	customer.setAffiliate(false);
	customer.setStaff(false);
	customer.setCustomerSince("10-02-2013");
	
	//Shopping List
	
	List<Item> list=new ArrayList<Item>();
	list.add(new GroceriesItems(212));
	list.add(new GroceriesItems(547));
	list.add(new GroceriesItems(853.25));
	list.add(new NonGroceriesItems(78.5));
	list.add(new NonGroceriesItems(87));
	customer.setItemList(list);
	System.out.println("your Total Bill After Discount is "+AppUtil.calculateBill(customer.getCustomer()));
}
}
