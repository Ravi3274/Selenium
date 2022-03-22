package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedDropDownHandle {
	

		static WebDriver driver;

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
			WebDriver driver = new ChromeDriver();
			
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			
		WebElement indus_ele = driver.findElement(By.id("Form_submitForm_Industry"));
		
	Select industry = new Select(indus_ele);
	industry.selectByIndex(5); 
		
   industry.selectByVisibleText("Automotive");
	industry.selectByValue("health");
			

			

}
}
