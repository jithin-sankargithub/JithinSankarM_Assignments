package Data;

public class DataPersistance {

	public static void main(String[] args) {
		 int randomNum = (int)(Math.random() * 9);
	        if((randomNum%2)==0){
	            Persistance client = new DatabasePersistance();
	            client.persist();
	        }
	        else{
	            Persistance client = new FilePersistance();
	            client.persist();
	        }

	}

}
