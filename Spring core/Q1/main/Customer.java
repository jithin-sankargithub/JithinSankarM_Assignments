package com.thespringcoreassignment;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	
	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	//public void setCustomerId(int customerId) {
		//this.customerId = customerId;
	//}
	public String getCustomerName() {
		return customerName;
	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
	public String getCustomerContact() {
		return customerContact;
	}
//	public void setCustomerContact(String customerContact) {
//		this.customerContact = customerContact;
//	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
//	public void setCustomerAddress(Address customerAddress) {
//		this.customerAddress = customerAddress;
//	}


	public String[] Display() {
		System.out.println("CustomerId "+customerId+" CustomerName "+customerName+
				" Customer contact "+customerContact);
		System.out.println("Customer Address  city "+customerAddress.getCity()+
				"state "+customerAddress.getState()+" Country "+customerAddress.getCountry()+
				" Street "+customerAddress.getStreet()+ " Zip "+customerAddress.getZip());
		String[] arr = {customerName,customerAddress.getState(),customerAddress.getCountry()};
		return arr;
	}

}
