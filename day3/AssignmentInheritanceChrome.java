package week2.day3;

public class AssignmentInheritanceChrome extends AssignmentInheritanceBrowser {

	
	public void openIncognito() {
		System.out.println("openIncognito ---> Chrome");
	}
		public void clearCache() {
			System.out.println("clearCache ---> Chrome");
		}
		
		public static void main(String[] args) {
			AssignmentInheritanceChrome chromeobj = new AssignmentInheritanceChrome();
			
			chromeobj.clearCache();
			chromeobj.closeBrowser();
			chromeobj.navigateBack();
			chromeobj.browserName = "chromebrowser";
			chromeobj.browserVersion = 12.4f;
			chromeobj.openURL();
			chromeobj.openIncognito();
			System.out.println("Browser Name:" + chromeobj.browserName  +  chromeobj.browserVersion);
		}
	}
		

