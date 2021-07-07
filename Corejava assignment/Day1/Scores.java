package company;
import java.util.Scanner;
public class Scores {

	public static void main(String[] args) {
	int  m1,m2,m3;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter marks in first subject");	
	m1=sc.nextInt();
	System.out.println("Enter marks of second subject");
	m2=sc.nextInt();
	System.out.println("Enter marks of third subject");
	m3=sc.nextInt();
	if(m1>=60&&m2>=60&&m3>=60) {
		System.out.println("Candidate passed");
	}
	else if((m1>=60&&m2>=60) || (m2>=60&&m3>=60) || (m1>=60&&m3>=60)) {
		System.out.println("Candidate promoted");
	}
		else {
			System.out.println("Candidate failed");
			
		}
		
	}

	}

