package week2.day3;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("enterUsername ---> LoginTestdata");
	}
	public void  enterPassword() {
		System.out.println("enterPassword ---> LoginTestdata");
	}

	public static void main(String[] args) {
		
		LoginTestData TD = new LoginTestData();
		TD.enterCredentials();
		TD.enterPassword();
		TD.enterUsername();
		TD.navigateToHomePage();
	}

}
