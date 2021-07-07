package interestsc;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		double amount,ci,si,rate,principal,period;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount");
		principal=sc.nextDouble();
		System.out.println("Enter the rate of interest");
		rate=sc.nextDouble();
		System.out.println("Enter the time period");
		period=sc.nextDouble();
		amount=principal*Math.pow(1+(rate/100),period);
		ci=amount-principal;
		si=(principal*rate*period)/100;
		System.out.println("Compound interest is "+ ci);
		System.out.println("Simple  interest is "+ si);
		
		
		

	}

}
