package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class RegistrationPage {

	private WebDriver driver;
	private ElementUtil elementutil;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		elementutil = new ElementUtil(this.driver);
		
	}


}
