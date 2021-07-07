package company;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		double intax=0,income;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Income");
		
		income= sc.nextDouble();
		if(income<=180000)
		{
			System.out.println("Income tax is Nil");
		}
		else if(income<=300000)
		{
            intax=0.1*income;
            System.out.println("Income tax per Slab B is "+ intax);
		}
		else if(income<=500000) {
			intax=0.2*income;
			System.out.println("Income tax per Slab C is "+ intax);
		}
		else if(income<=1000000) {
			intax=0.3*income;
			System.out.println("Income tax per Slab D is "+ intax);
		}
}
}