package corejava;

public class DriverTest {
	
	public void connection(String driver) {
		System.out.println("Database is connected with oracle and with"+ driver +"driver");
		System.out.println("connected with default user name and  default password.");
	}
	public void connection(String driver, String database) {
		System.out.println("Database is connected with"+ database +" database and  with type "+ driver+"driver ");
		System.out.println("connected with default user name and  default password.");
	}
	
	public void connection(String driver, String database, String username) {
		System.out.println("Database is connected with"+ database +" database and  with type "+ driver+"driver ");
		System.out.println("The username is : "+username +" and with default password.");
	}
	public void connection(String driver, String database, String username, String password) {
		System.out.println("Database is connected with"+ database +" database and  with type "+ driver+"driver ");
		System.out.println("The username is : "+username +" and with"+password +" password");
	}
}
