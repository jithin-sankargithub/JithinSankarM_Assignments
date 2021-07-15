package assignment3;

import java.util.Scanner;

public class ChattingApplication {

	public static void main(String[] args) {
		User u1 = new User("arnold","ar123");
		User u2= new User("kenway","ke123");
		User u3= new User("stark","st123");
		User u4 = new User("arya","ary123");
		
		ChatRoom c1 = new ChatRoom();
		c1.addUser(u1);
		c1.addUser(u2);
		c1.addUser(u3);
		c1.addUser(u4);
		
		
		int i =0;
		do {
			Scanner scint= new Scanner(System.in);
			Scanner scline = new Scanner(System.in);
			System.out.println("Enter your option\n 1- Login \n 0-Exit");
			i=scint.nextInt();
			if(i==1) {
				String name;
				String pass;
				System.out.println("Welcome to the Chat application powered by Java");
				System.out.println("Enter your username to login");
				 name = scline.nextLine();
				System.out.println("Enter your password");
			     pass = scline.nextLine();
				User userlog = new User(name,pass);
				if(c1.isValidUser(userlog)) {
					int n=0;
					do {
						System.out.println("Enter your choice \n 1- Join Chat \n 0-Log out");
						n=scint.nextInt();
						if(n==1) {
							int m=0;
							do {
								System.out.println("Enter your choice\n 1-Send message\n 2-Show chat participants\n 3-Show chat messages\n 4-Clear all chats\n 0-Exit out of the chat");
								m=scint.nextInt();
								switch(m) {
								case 1:
									System.out.println("Enter message");
									String msg= scline.nextLine();
									c1.addMessage(userlog, msg);
									break;
								case 2:
									c1.getUser();
								case 3:
									c1.getChat();
								case 4:
									c1.clearChat();
								case 0:
									break;
									
									default :
										System.out.println("Enter a valid option");
								}
								
							}while(m!=0);
							
						}
						else {
							System.out.println("Logged out successfully");
						}
						
					}while(n!=0);
					
					
				}
				else {
					System.out.println("Please enter valid credentials");
				}
				
				
			}
			else {
			System.out.println("Please enter the correct option");
		      }
			
		}while(i!=0);
		

	}

}
