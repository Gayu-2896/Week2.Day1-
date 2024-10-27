package week2.day4;

public class AssignmentOnJavaConnection extends AssignmentOnMySqlConnection implements AssignmentOnDatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("executeQuery");
		
	}
	
	public static void main(String[] args) {
		AssignmentOnJavaConnection JC=new AssignmentOnJavaConnection();
	    JC.connect();
		JC.disConnect();
		JC.executeUpdate();
		JC.executeQuery();
		}

}
