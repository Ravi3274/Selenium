package com.qa.opencart.tests;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.opencart.utils.Constants;
public class AccountsPageTest extends BaseTest {

	//@BeforeClass
	//public void accPageSetUp() {
	//	accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	//}

	@Test
	public void accPageTitleTest() {
		String title = accPage.getAccPageTitle();
		System.out.println("Acc Page title is: " + title);
		Assert.assertEquals(title, Constants.ACC_PAGE_TITLE);
	}

	@Test
	public void accPageHeaderTest() {
		String header = accPage.getAccPageHeader();
		System.out.println("Acc Page header is: " + header);
		Assert.assertEquals(header, Constants.ACC_PAGE_HEADER);
	}

	@Test
	public void accPageSectionsListTest() {
		List<String> secList = accPage.getAccSectionsList();
		softAssert.assertEquals(secList.size(),4);
		softAssert.assertAll();
	}

	
}