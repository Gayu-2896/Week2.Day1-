package week2.day3;

public class AssignmentOverriding extends AssignmentOverloading {


public void classRoom() {
System.out.println("status");
}
public void reportStep(String msg, String status, Boolean snap) {
	System.out.println(msg);
	System.out.println(status);
	System.out.println(snap);
		}
	public static void main(String[] args) {
		
		AssignmentOverriding OR = new AssignmentOverriding();
		OR.classRoom();
		OR.reportStep("Assignment", "done", true);
	}

}
