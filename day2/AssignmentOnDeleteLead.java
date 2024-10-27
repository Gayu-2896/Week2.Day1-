package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnDeleteLead {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find ')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("56789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		String AD="No records to display";
		if(text2.equals(AD)) {
			System.out.println("Account deleted successfully");
		}
		else {
			System.out.println("Account not deleted");
		}
        driver.close();
	}

}
