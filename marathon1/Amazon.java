package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("Bag for boys");
		element.sendKeys(Keys.ENTER);
		String  result= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result);
		driver.findElement(By.xpath("(//div[contains(@class,'fancy')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest')]")).click();
		String bagName = driver.findElement(By.xpath("(//h2[contains(@class,'clamp')])[1]")).getText();
		System.out.println(bagName);
		String discountPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(discountPrice);
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		
		
		
	}

}
