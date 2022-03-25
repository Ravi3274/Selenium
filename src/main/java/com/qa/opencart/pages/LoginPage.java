package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;



public class LoginPage  {
	
	private WebDriver driver;
	
	
		private By emailId = By.id("input-email");
		private By password = By.id("input-password");
		private By loginButton = By.xpath("//input[@value='Login']");
		private By forgotPwdLink = By.linkText("Forgotten Password");
		private By footerLinks = By.xpath("//footer//div[@class='row']//a");
	
		
		
			public LoginPage(WebDriver driver) {
				this.driver = driver;
				
			}

			public String getLoginPageTitle() {
				return  driver.getTitle();
			}

		
			public boolean isForgotPwdLinkExist() {
				return driver.findElement(forgotPwdLink).isDisplayed();
			}

			public AccountsPage doLogin(String un, String pwd) {
			    driver.findElement(emailId).sendKeys(un);
				driver.findElement(password).sendKeys(pwd);
				driver.findElement(loginButton).click();
				return new AccountsPage(driver);
			}

		
			public List<String> getFooterLinks() {
				List<WebElement> footerList = driver.findElements(footerLinks);
				List<String> footerTextList = new ArrayList<String>();

				for (WebElement e : footerList) {
					footerTextList.add(e.getText());
				}
				return footerTextList;

			}

		

		}

		