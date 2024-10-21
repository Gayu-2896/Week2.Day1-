package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		
		WebElement SourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select Sel = new Select(SourceDD);
		Sel.selectByIndex(2);
		
		WebElement MC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select sel2 =new Select(MC);
		sel2.selectByVisibleText("Car and Driver");
		
		WebElement IND = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select sel3 = new Select(IND);
		sel3.selectByValue("IND_DISTRIBUTION");
		
		
	
	}

}
