package com.assignment3;

public class Parked_Car_Owner_Details {
	String owerName;
	String carModel;
	double owerMobileNo;
	String owerAddress;
	
	public String getOwerName() {
		return owerName;
	}
	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public double getOwerMobileNo() {
		return owerMobileNo;
	}
	public void setOwerMobileNo(double owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}
	public String getOwerAddress() {
		return owerAddress;
	}
	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}
	@Override
	public String toString() {
		return "Parked_Car_Owner_Details [owerName=" + owerName + ", carModel=" + carModel + ", owerMobileNo="
				+ owerMobileNo + ", owerAddress=" + owerAddress + "]";
	}
	
	

}
