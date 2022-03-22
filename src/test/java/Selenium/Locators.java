package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
		public static void main(String[] args) {

			
			WebDriver driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/index.html");
			
			By username = By.name("username");
			
			//name: can be duplicate
			driver.findElement(By.name("username")).sendKeys("testing");
			
			//className: can be duplicate
			driver.findElement(By.className("abc")).sendKeys("testing");
			
			//xpath: is not an attribute
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("testing");
			
			//css Selector: not an attribute
			//CSS: Cascaded Style Sheet
			driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("testing");
			
			//partialLinkText: only for links : tag : <a>
			driver.findElement(By.partialLinkText("Forgotten")).click();
			
			
		}

	}


