package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/");
			driver.findElement(By.name("username")).sendKeys("groupautomation");
			driver.findElement(By.name("password")).sendKeys("Test@12345");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			


}
	}
