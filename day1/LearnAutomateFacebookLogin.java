package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAutomateFacebookLogin {

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tuna@123");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Find your account and log in.")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Forgotten Password | Can't Log In | Facebook"))
        {	
        	System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}	
//		driver.close();

		
	}

}