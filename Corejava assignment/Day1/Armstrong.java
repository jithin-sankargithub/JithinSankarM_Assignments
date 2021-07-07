package company;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int num,rem=0,result=0,newnum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		newnum=num;
		while (newnum!=0) {
	        rem = newnum % 10;
	        result = result + rem * rem * rem;
	        newnum = newnum / 10;
	    }
		if(result==num)
		    System.out.println("It is an Armstrong number");
		else
		    System.out.println("Not an Armstrong number");


	}

}
