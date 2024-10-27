package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXPath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("democsr");
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
	driver.findElement(By.xpath("//a [contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}

}
