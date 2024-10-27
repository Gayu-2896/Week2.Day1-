package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnEditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Edu Tech Platform");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jayasanker");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gayu2896");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium is Interesting");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("gayathrijayasanker28@gmail.com");
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select SP = new Select(element);
		SP.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Learning");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
