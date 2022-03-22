package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/ravi.singh/Documents/chromedriver");
			WebDriver driver = new ChromeDriver();

			driver.get("http://www.londonfreelance.org/courses/frames/index.html");

			// driver.switchTo().frame(2);
			// driver.switchTo().frame("main");
			driver.switchTo().frame(driver.findElement(By.name("main")));

			String header = driver.findElement(By.xpath("/html/body/h2")).getText();

			System.out.println(header);

			driver.switchTo().defaultContent();

			driver.switchTo().parentFrame();

			

		}

	}

	
