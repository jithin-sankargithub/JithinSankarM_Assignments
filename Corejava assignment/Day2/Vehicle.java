package com.company;

abstract class Vehicle {
 private String name;
 
 public Vehicle(String name) {
	 this.name=name;
	 
 }
 public abstract void move();
}
class Car extends Vehicle{
	
	public Car(String name) {
	
	super(name);
	
	}
	public void move() {
		
		System.out.println("Car accelerates");
		
	}
}

 class Aeroplane extends Vehicle{
	 
	 public Aeroplane(String name)
	 {
		 super(name);
	 }
	 public void move() {
		 System.out.println("Aeroplane flies");
	 }
 
 public class abstract{
	 public static void main(String[] args) {
		 Car c = new Car("Hyundai") ;
		 Aeroplane a = new Aeroplane("Boeing");
				 c.move();
		                 a.move();
	 }
 }