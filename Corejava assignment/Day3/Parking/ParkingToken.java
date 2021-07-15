package com.assignment3;

public class ParkingToken {
	int token;
	static int i=1;
	
	public ParkingToken() {
		this.token=i;
		i++;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "ParkingToken [token=" + token + "]";
	}
	

}
