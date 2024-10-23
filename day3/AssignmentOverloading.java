package week2.day3;

public class AssignmentOverloading {

	public void reportStep(String msg, String status) {
System.out.println(msg);
System.out.println(status);
	}
	public void reportStep(String msg, String status, Boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
			}

	
	public static void main(String[] args) {
		
		AssignmentOverloading OL = new AssignmentOverloading();
		OL.reportStep("Hi", "yet to completed");
		OL.reportStep("Hello", "completed", true);
		
	}

}
