package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class AssignmentLeafgroundButtonInteraction {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		boolean enabled = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		WebElement element = driver.findElement(By.xpath("(//h5[contains(text(),'position')]/following-sibling::button//span)[2]"));
		Point location = element.getLocation();
		System.out.println(location);
		WebElement element1 = driver.findElement(By.xpath("(//h5[contains(text(),'Save')]/following-sibling::button)"));
		String cssValue = element1.getCssValue("background-color");
		System.out.println(cssValue);
		String asHex = Color.fromString(cssValue).asHex();
		System.out.println(asHex);
		WebElement element2 = driver.findElement(By.xpath("(//h5[contains(text(),'width')]/following-sibling::button)"));
		Dimension size = element2.getSize();
		System.out.println(size);
		driver.close();
	}

}
