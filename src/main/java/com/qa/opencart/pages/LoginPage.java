package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;



public class LoginPage  {
	
	private WebDriver driver;
	private ElementUtil elementutil;
	
	
		private By emailId = By.id("input-email");
		private By password = By.id("input-password");
		private By loginButton = By.xpath("//input[@value='Login']");
		private By forgotPwdLink = By.linkText("Forgotten Password");
		private By footerLinks = By.xpath("//footer//div[@class='row']//a");
		private By registerLink = By.linkText("Register");
	
		
		
			public LoginPage(WebDriver driver) {
				this.driver = driver;
				elementutil = new ElementUtil(this.driver);
				
			}

			public String getLoginPageTitle() {
				return elementutil.getPageTitle(Constants.LOGIN_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
			}

		
			public boolean isForgotPwdLinkExist() {
				return  elementutil.doIsDisplayed(forgotPwdLink);
			}

			public AccountsPage doLogin(String un, String pwd) {
			  elementutil.doSendKeys(emailId, un);
			  elementutil.doSendKeys(password, pwd);
			  elementutil.doClick(loginButton);
				return new AccountsPage(driver);
			}

		
			public List<String> getFooterLinks() {
				List<WebElement> footerList = elementutil.getElements(footerLinks);
				List<String> footerTextList = new ArrayList<String>();

				for (WebElement e : footerList) {
					footerTextList.add(e.getText());
				}
				return footerTextList;

			}
			
			public RegistrationPage navigateToRegisterPage() {
				elementutil.doClick(registerLink);
				return new RegistrationPage(driver);
			}

		}

		

		

		