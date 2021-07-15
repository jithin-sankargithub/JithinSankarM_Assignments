package com.assignment3;

import java.util.Scanner;

public class ParkingSlot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parked_CarOwnerList list = new Parked_CarOwnerList();
		
		int option=0;
		do {
			System.out.println("****Menu****");
			System.out.println("[1- Park your car]  [2- Take away your car]  [3- Find your car location] [0-Exit] ");
			option = sc.nextInt();
			switch(option) {
			case 1:
				ParkingToken tokenno = new ParkingToken();
				int i = tokenno.getToken();
				if(i<=240) {
					Parked_Car_Owner_Details obj = new Parked_Car_Owner_Details();
					String n=sc.nextLine();
					System.out.println("Enter your name");
					String name =sc.nextLine();
					obj.setOwerName(name);
					System.out.println("Enter your mobile number");
					double mobno=sc.nextDouble();
					obj.setOwerMobileNo(mobno);
					String n1 = sc.nextLine();
					System.out.println("Enter your car model");
					String model= sc.nextLine();
					obj.setCarModel(model);
					System.out.println("Enter your Address");
					String address=sc.nextLine();
					obj.setOwerAddress(address);
					list.add_new_car(i, obj);
					break;
				}
				else
				{
					System.out.println("No Parking slot available");
					
				}
			case 2:
				System.out.println("Enter your token number");
				int rtok=sc.nextInt();
				System.out.println("Releasing your car");
			    list.remove_car(rtok);
			    break;
			case 3:
				System.out.println("Enter your Token number");
				int ftok=sc.nextInt();
				list.find_car_location(ftok);
				break;
		
				
				
			}
		}while(option!=0);
sc.close();
	}

}
