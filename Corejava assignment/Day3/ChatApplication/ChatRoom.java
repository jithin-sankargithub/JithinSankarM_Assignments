package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	
	List<User> list = new ArrayList<>();
	List<Message> chatroom = new ArrayList<>();
	
	public void addUser(User u) {
		this.list.add(u);
		
	}
	public void getUser() {
		for(User e : list) {
			System.out.println(e);
			
		}	
	}
	public boolean isValidUser(User u) {
		if(this.list.contains(u)) {
			return true;
		}
		else {
			return false;
		}
	}
	public void addMessage(User u,String msg) {
		this.chatroom.add(new Message(u,msg));
	}
	public void getChat() {
		for(Message m:chatroom) {
			System.out.println(m);
		}
	}
	public void clearChat() {
		this.chatroom.clear();
	}

}
