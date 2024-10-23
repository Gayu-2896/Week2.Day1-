package week2.day3;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Assignment Completed");
	}

	public static void main(String[] args) {
		
		LoginPage LP = new LoginPage();
		LP.clickElement();
		LP.enterText();
		LP.findElement();
		LP.performCommonTasks();
		
		
		}

}
