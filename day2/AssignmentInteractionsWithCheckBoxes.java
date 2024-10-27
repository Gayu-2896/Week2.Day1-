package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInteractionsWithCheckBoxes {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text);
		if (text.contains("Checked")) {
			System.out.println("verified");
		} else {
			System.out.println("Not verified");
		}
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		Thread.sleep(5000);
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'State')]")).getText();
		System.out.println(text2);
		if (text2.contains("State")) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(5000);
		String text3 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text3);
		if (text.contains("Checked")) {
			System.out.println("verified");
		} else {
			System.out.println("Not verified");
		}
		boolean status = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(status);
		driver.findElement(By.xpath("(//h5[text()='Select Multiple']/following-sibling::div/div[3])")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		driver.close();
}
}
