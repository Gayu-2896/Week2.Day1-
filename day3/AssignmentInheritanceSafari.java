package week2.day3;

public class AssignmentInheritanceSafari extends AssignmentInheritanceBrowser {

	public void  readerMode() {
		System.out.println(" readerMode ---> Safari");
	}
		public void fullScreenMode() {
			System.out.println("fullScreenMode ---> Safari");
		}
		
		public static void main(String[] args) {
			AssignmentInheritanceSafari safariobj = new AssignmentInheritanceSafari();
			safariobj.browserName = "Safari Browser";
			safariobj.browserVersion = 16.9f;
			safariobj.closeBrowser();
			safariobj.fullScreenMode();
			safariobj.navigateBack();
			safariobj.openURL();
			safariobj.readerMode();
  
			
			System.out.println("Browser Name:" + safariobj.browserName  +  safariobj.browserVersion);
		}
	}
