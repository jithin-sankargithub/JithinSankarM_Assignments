package com.company;

import java.util.Objects;

public class Dob {
	int day;
	int month;
	int year;
	

	public Dob(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day,month);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dob other = (Dob) obj;
		return day == other.day && month == other.month;
	}

	
	@Override
	public String toString() {
		return  day + "-" + month + "-" + year;
	}

}
