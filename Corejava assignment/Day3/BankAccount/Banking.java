package com.company;

public class Banking {

	public static void main(String[] args) {
		
         BankAccountList accountList= new BankAccountList();
		
         accountList.addUser(new SavingsAccount(0001,"Akram",25000f, false));
         accountList.addUser(new SavingsAccount(0004,"Sanoop",340000f, true));
         accountList.addUser(new SavingsAccount(1098,"Paul",450300f, true));
         accountList.addUser(new SavingsAccount(1898,"Arshak",690000f, false));
         accountList.addUser(new SavingsAccount(1346,"Ronald",34500f, false));


		System.out.println(accountList);

	}

}
