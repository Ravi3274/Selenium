package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_Up_Js {
	
			public static void main(String[] args) throws InterruptedException {

			
				System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
				WebDriver driver = new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click();
			
			
			
			Alert alert = driver.switchTo().alert();
			
			
			String text = alert.getText();
			System.out.println(text);
			Thread.sleep(2000);
			
			alert.accept(); //click on OK button
			
			//alert.dismiss(); //cancel the alert

}
}
