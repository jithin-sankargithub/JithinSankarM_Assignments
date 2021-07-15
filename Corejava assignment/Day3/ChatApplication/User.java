package assignment3;

import java.util.Objects;

public class User {
	private String userName;
	private String password;
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userName, other.userName);
	}


	@Override
	public String toString() {
		return "User userName=" + userName ;
	}
	
	  

}
