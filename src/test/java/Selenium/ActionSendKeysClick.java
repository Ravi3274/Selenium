package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysClick {
	
	static WebDriver driver;

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
			driver = new ChromeDriver();
			
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			
			By email = By.id("input-email");
			By password = By.id("input-password");
			By loginButton = By.xpath("//input[@value='Login']");
			
			Actions act = new Actions(driver);
					act.sendKeys(driver.findElement(email), "naveen@gmail.com").perform();
         	act.sendKeys(driver.findElement(password), "naveen@123").perform();
			act.click(driver.findElement(loginButton)).perform();
			
		

}
}
