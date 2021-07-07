package company;

public class Armstrongnum {

	public static void main(String[] args) {
		int rem=0,result=0,newnum=0,i;
		System.out.println("Armsrtong numbers between 100 to 999");
		for(i=100;i<=999;i++)
		{
			newnum=i;
			while (newnum!=0) {
		        rem = newnum % 10;
		        result = result + rem * rem * rem;
		        newnum = newnum / 10;
			}
			if(result==i) {
				System.out.println(i);
			}
			result=0;
		}
			
	}

}
