package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Movieticket {

	public static void main(String[] args) throws InterruptedException {
         ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX National,Virugambakkam Chennai')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("(//span[text()='DEEPAVALI BONUS'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Timing')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'10:00')]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:5']")).click();
		String SN = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat No. :" + SN);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String Title = "PVR Cinemas";
		if (title.equals(Title)) {
			System.out.println("Matched");

		} else {
			System.out.println("Not Matched");
		}
         driver.close();
	}

}
