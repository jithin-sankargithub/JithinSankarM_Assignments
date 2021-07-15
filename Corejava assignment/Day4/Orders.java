package com.assignment4;

public class Orders {
	int customerid;
	String custname;
	double orderamount;
	String orderstatus;
	
	public Orders(int customerid, String custname, double orderamount, String orderstatus) {
		super();
		this.customerid = customerid;
		this.custname = custname;
		this.orderamount = orderamount;
		this.orderstatus = orderstatus;
	}
	
	@Override
	public String toString() {
		return "Orders [customerid=" + customerid + ", custname=" + custname + ", orderamount=" + orderamount
				+ ", orderstatus=" + orderstatus + "]";
	}
	
	
	
	

}
