package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;


public class searchResultsPageTest extends BaseTest {

	@BeforeClass
	public void accPageSetUp() {
		accPage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
}




