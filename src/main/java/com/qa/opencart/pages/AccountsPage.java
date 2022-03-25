package com.qa.opencart.pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AccountsPage {
	private WebDriver driver;
	

	private By accSections = By.cssSelector("div#content h2");
	private By header = By.cssSelector("div#logo a");
	private By logoutLink = By.linkText("Logout");
//	private By searchField = By.name("search");
//	private By searchButton = By.cssSelector("div#search button");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public String getAccPageTitle() {
		return driver.getTitle();
	}

	public String getAccPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getAccPageHeader() {
		return driver.findElement(header).getText();
	}

	public List<String> getAccSectionsList() {
		List<String> accSecValList = new ArrayList<String>();
		List<WebElement> accSecList = driver.findElements(accSections);
		for (WebElement e : accSecList) {
			accSecValList.add(e.getText());
		}
		return accSecValList;
	}

	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}

	public void logout() {
		if (isLogoutLinkExist())
			driver.findElement(logoutLink).click();
	}


}




