package Selenium;
import org.testng.Assert;
import org.testng.annotations.*;



public class Testng_Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite -- create a user in DB");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest -- launch browser");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass -- enter url");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod -- login to app");
	}

	@Test
	public void titleTest() {
		System.out.println("title test");
		Assert.assertEquals("google", "google");
	}

	@Test
	public void searchTest() {
		System.out.println("search test");
		Assert.assertEquals("naveen", "naveen");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod -- logout");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass -- close the browser");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest -- delete the user");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite --- close the DB connection");
	}

}


