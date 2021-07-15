package assignment3;

public class Message {
	private long sendTime;
	private User user;
	private String message;
	public Message(User user, String message) {
		super();
		this.sendTime = System.currentTimeMillis();
		this.user = user;
		this.message = message;
	}
	
	public String toString() {
		return  user + " : " + message;
	}
	

}
