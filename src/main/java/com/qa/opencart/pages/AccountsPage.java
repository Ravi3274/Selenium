package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;


public class AccountsPage {
	private WebDriver driver;
	private ElementUtil elementutil;
	

	private By accSections = By.cssSelector("div#content h2");
	private By header = By.cssSelector("div#logo a");
	private By logoutLink = By.linkText("Logout");
	private By searchField = By.name("search");
	private By searchButton = By.cssSelector("div#search button");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementutil = new ElementUtil(this.driver);
		
	}

	public String getAccPageTitle() {
		return elementutil.getPageTitle(Constants.ACC_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
		
	}

	public boolean getAccPageUrl() {
		return elementutil.waitForURL("route=account", Constants.DEFAULT_TIME_OUT);
	}

	public String getAccPageHeader() {
		return elementutil.doGetText(header);
	}


	public List<String> getAccSectionsList() {
		List<String> accSecValList = new ArrayList<String>();
		List<WebElement> accSecList = elementutil.getElements(accSections);
		for (WebElement e : accSecList) {
			accSecValList.add(e.getText());
		}
		
		return accSecValList;
	}

	public boolean isLogoutLinkExist() {
		return elementutil.doIsDisplayed(logoutLink);
	}

	public void logout() {
		if (isLogoutLinkExist())
			elementutil.doClick(logoutLink);
	}
	
	public searchResultsPage doSeaarh(String ProductName)
	{
	System.out.println("Product name is " + ProductName);  
	elementutil.doSendKeys(searchField, ProductName);
	elementutil.doClick(searchButton);
	return new searchResultsPage(driver);
	}


}




