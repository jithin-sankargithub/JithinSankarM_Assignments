package com.assignment3;

import java.util.HashMap;
import java.util.Map;

public class Parked_CarOwnerList {
	Map<Integer,Parked_Car_Owner_Details> map = new HashMap<>();
	
	public void add_new_car(int t,Parked_Car_Owner_Details pcod)
	{
		this.map.putIfAbsent(t,pcod);
		System.out.println("Parking Slot Granted");
		System.out.println("Token number is "+t);
		System.out.println(map.get(t));
		
	}
	public void remove_car(int remtok) {
		map.remove(remtok);
		
	}
	public void find_car_location(int loctok) {
		if(loctok<=80)
			System.out.println("Car is in the first floor");
		else if(loctok>80 && loctok<=160) {
			System.out.println("Car is in the second floor");
		}
			else if(loctok>160 &&loctok<=240) {
				System.out.println("Car is in the third floor");
				
			}
			else
				System.out.println("Please enter the correct token number");
		}
			
	}
	


