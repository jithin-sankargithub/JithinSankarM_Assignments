package com.company;

import java.util.Scanner;

class Student{
	int s1,s2,s3;
	Student(){
		s1=0;
		s2=0;
	    s3=0;
	}
	public void setMarks(int n1,int n2,int n3){
		s1=n1;
		s2=n2;
		s3=n3;
	}
	public void getAvg(int i){
		int avg =0;
		avg=(s1+s2+s3)/3;
		System.out.println("Average mark for student "+i+" is : "+avg);
	}
	public void getTotal(int i){
		int total =0;
		total=s1+s2+s3;
		System.out.println("Total mark for student "+i+" is : "+total);
	}
}

public class studentMarks {

	public static void main(String[] args){
		int totalsub=0;
		Scanner s = new Scanner(System.in);
		Student[] stud = new Student[3];
		stud[0] = new Student();
		stud[1] = new Student();
		stud[2] = new Student();
		for(int i=0;i<3;i++){
			int n1=0,n2=0,n3=0;
			System.out.println("Enter mark of 3 subjects for student ");
			n1= s.nextInt();
			n2= s.nextInt();
			n3= s.nextInt();
			stud[i].setMarks(n1,n2,n3);
		}

		System.out.println("\nAverage marks of students \n");
		for(int i=0;i<3;i++){
			stud[i].getAvg(i+1);
		}
		System.out.println("\nTotal marks of students \n");
		for(int i=0;i<3;i++){
			stud[i].getTotal(i+1);
		}

		System.out.print("\nTotal marks for subject 1   :");
		totalsub=stud[0].s1+stud[1].s2+stud[2].s3;
		System.out.print(totalsub);
		System.out.print("\nAverage marks for subject 1 :");
		System.out.print(totalsub/3);

		System.out.print("\nTotal marks for subject 2   :");
		totalsub=stud[0].s2+stud[1].s2+stud[2].s3;
		System.out.print(totalsub);
		System.out.print("\nAverage marks for subject 2 :");
		System.out.print(totalsub/3);

		System.out.print("\nTotal marks for subject 3   :");
		totalsub=stud[0].s3+stud[1].s3+stud[2].s3;
		System.out.print(totalsub);
		System.out.print("\nAverage marks for subject 3 :");
		System.out.print(totalsub/3);
		System.out.println();
		s.close();
	}
}



