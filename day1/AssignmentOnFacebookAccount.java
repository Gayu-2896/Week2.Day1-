package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentOnFacebookAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Gayathri");
		driver.findElement(By.name("lastname")).sendKeys("Jayasanker");
		WebElement Input = driver.findElement(By.id("day"));
		Select bg  =new Select(Input);
		bg.selectByVisibleText("28");
		
		WebElement Input1 = driver.findElement(By.id("month"));
		Select Mon = new Select(Input1);
		Mon.selectByIndex(10);
		
		WebElement Input2 = driver.findElement(By.id("year"));
		Select yea = new Select(Input2);
		yea.selectByValue("1996");
		
		
		
	}

}
