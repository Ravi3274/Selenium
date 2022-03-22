package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Url {
	
	public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://google.com");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			 if(title.equals("Google")) {
				System.out.println("correct title");
			}
			else {
				System.out.println("incorrect title");
			}
			
			System.out.println(driver.getCurrentUrl());
			
			
			driver.quit();
		
			
		}
	
	

}
