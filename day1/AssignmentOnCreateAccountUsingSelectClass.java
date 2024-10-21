package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnCreateAccountUsingSelectClass {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.id("username")).sendKeys("democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
		// ---> return type(ctrl 2+l)	WebElement element = driver.findElement(By.className("decorativesubmit"));element.click();
				driver.findElement(By.partialLinkText("CRM")).click();
				
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.id("accountName")).sendKeys("Edu tech Platform hold by testleaf");
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				
				
				WebElement Industry = driver.findElement(By.name("industryEnumId"));
				
				Select Sel = new Select(Industry);
				Sel.selectByIndex(3);
				
				WebElement own = driver.findElement(By.name("ownershipEnumId"));
				
				Select sel2 =new Select(own);
				sel2.selectByVisibleText("S-Corporation");
				
				WebElement Source = driver.findElement(By.name("dataSourceId"));
				
				Select sel3 = new Select(Source);
				sel3.selectByValue("LEAD_EMPLOYEE");
				
                WebElement MC = driver.findElement(By.id("marketingCampaignId"));
				
				Select Acc1 = new Select(MC);
				Acc1.selectByIndex(6);
				
               WebElement Source1 = driver.findElement(By.id("generalStateProvinceGeoId"));
				
				Select Acc2 = new Select(Source1);
				Acc2.selectByValue("TX");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				String title1 = driver.getTitle();
		        System.out.println(title1);
		        if(title1.equals("Account Details | opentaps CRM"))
		        {	
		        	System.out.println("Account name is Verified correctly");
				} else {
					System.out.println("Account name is Not Verified correctly");
				}	
			
			driver.close();
			}

		}