package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentOnCreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
// ---> return type(ctrl 2+l)	WebElement element = driver.findElement(By.className("decorativesubmit"));element.click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayasanker"); 
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
        System.out.println(title1);
        if(title1.equals("View Lead | opentaps CRM"))
        {	
        	System.out.println("Title is matched");
		} else {
			System.out.println("Title is not matched");
		}
driver.close();
	}

}
