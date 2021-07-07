package company;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
	int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter element to be searched");
	
	int elem = sc.nextInt();
	
	for(int i=0;i<=15;i++) {
		if(arr[i]==elem) {
			System.out.println("Element found at position "+i);
			System.exit(0);
		}
	
	}
	sc.close();
	}

	}


