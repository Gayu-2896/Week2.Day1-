package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWithRadioButton {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/parent::div")).click();
		boolean status = driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/parent::div")).isSelected();
		System.out.println(status);
		boolean safari = driver.findElement(By.xpath("//input[@value='Option3']")).isSelected();
		System.out.println(safari);
		boolean status2 = driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/parent::div")).isSelected();
		System.out.println(status2);
		boolean Agegroup = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println(Agegroup);
		driver.close();
}		
}
