package com.xibia.app.pojo;

import java.util.List;

import com.xibia.app.Ipojo.Item;

public class Customer {

	private String mobileNo;
	private boolean isStaff;
	private boolean isAffiliate;
	private String customerSince;
	private List<Item> itemList;
	
	public Customer(CustomerBuilder builder){
		this.mobileNo =builder.mobileNo;
		this.isStaff = builder.isStaff;
		this.isAffiliate = builder.isAffiliate;
		this.customerSince = builder.customerSince;
		this.itemList = builder.itemList;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public boolean isStaff() {
		return isStaff;
	}
	public boolean isAffiliate() {
		return isAffiliate;
	}
	public String getCustomerSince() {
		return customerSince;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public static class CustomerBuilder{
		private String mobileNo;
		private boolean isStaff;
		private boolean isAffiliate;
		private String customerSince;
		private List<Item> itemList;
		
		public CustomerBuilder setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}
		public CustomerBuilder setStaff(boolean isStaff) {
			this.isStaff = isStaff;
			return this;
		}
		public CustomerBuilder setAffiliate(boolean isAffiliate) {
			this.isAffiliate = isAffiliate;
			return this;
		}
		public CustomerBuilder setCustomerSince(String customerSince) {
			this.customerSince = customerSince;
			return this;
		}
		public CustomerBuilder setItemList(List<Item> itemList) {
			this.itemList = itemList;
			return this;
		}
		public Customer getCustomer(){
			return new Customer(this);
		}
		
	}
	
}
