package week2.day3;

public class AssignmentInheritanceEdge extends AssignmentInheritanceBrowser {

	public void takeSnap() {
		System.out.println("takeSnap ---> Edge");
	}
		public void clearCookies() {
			System.out.println("clearCookies ---> Edge");
		}
		
		public static void main(String[] args) {
			AssignmentInheritanceEdge edgeobj = new AssignmentInheritanceEdge();
					
     		edgeobj.clearCookies();
			edgeobj.closeBrowser();
			edgeobj.navigateBack();
			edgeobj.openURL();
			edgeobj.takeSnap();
			edgeobj.browserName = "Edge Browser";
			edgeobj.browserVersion = 9.6f;
			
			System.out.println("Browser Name:" + edgeobj.browserName  +  edgeobj.browserVersion);
		}
	}
		
