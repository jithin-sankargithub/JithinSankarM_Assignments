package com.person;



public class Person implements Comparable<Person>{
	int weight;
	int height;
    String name;
	public Person(int weight, int height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
if(this.weight==o.getWeight()){	
			
			if(this.height==o.getHeight())
				return 0;
			else if(this.height>o.getHeight()) 
				return 1;
			else
				return-1;
		}else if(this.weight>o.getWeight()) {
			return 1;
		}else {
			return -1;
			}		
	}
    

}
