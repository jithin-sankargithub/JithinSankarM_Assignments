
package com.company
class Account {
	double balance;
	Account(){
		balance=0;
	}
	Account(double balance){
		this.balance=balance;
	}
	double getbalance() {
		return balance;
	}

}

class Current extends Account {
	double cashcredit;
	Current(double balance,double cd){
		this.balance=balance;
		this.cashcredit=cd;
	}
double getbalance(double d) {
	return getbalance(balance+cashcredit);
}

}
 class Savings extends Account {
double fixed;
Savings(double balance,double f){
	this.balance=balance;
	this.fixed=f;
	
}

double getbalance()
{
	return(balance+fixed);
}
}
 
 public class Totcash {

		public static void main(String[] args) {
			Savings s=new Savings(20000,34000);
			Current c=new Current(35000,75000);
			System.out.println("Savings cash in bank"+s.getbalance());
			System.out.println("Current account balance"+c.getbalance());
			

		}

	}
