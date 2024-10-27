package week2.day4;

public class AssignmentOnConcrete implements AssignmentOnDatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect to online class");
		
	}

	@Override
	public void disConnect() {
	System.out.println("Disconnect due to network");
		
	}

	@Override
	public void executeUpdate() {
	System.out.println("checking with other networks");	
	
	}
	
	
	public static void main(String[] args) {
		AssignmentOnConcrete concrete =new AssignmentOnConcrete();
	concrete.connect();
	concrete.disConnect();
	concrete.executeUpdate();
	

	}


}
