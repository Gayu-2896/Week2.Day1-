package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentOnCreateAccount {

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
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Edu tech Platform by testleaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("150"); 
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
        System.out.println(title1);
        if(title1.equals("Account Details | opentaps CRM"))
        {	
        	System.out.println("Title is displayed Correctly");
		} else {
			System.out.println("Title is not displayed Correctly");
		}
        driver.close();
	}

}
