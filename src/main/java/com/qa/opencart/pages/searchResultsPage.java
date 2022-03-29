package com.qa.opencart.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class searchResultsPage {

        private WebDriver driver;
		private ElementUtil elementutil;
		

		private By SerachHeaderName = By.cssSelector("div#content h2");
		private By ProductResultsPage = By.cssSelector("div.caption a");
		
		

		public searchResultsPage(WebDriver driver) {
			this.driver = driver;
			elementutil = new ElementUtil(this.driver);
			
		}
		
	  public String getSearchProdutList()
	  {
	   return elementutil.doGetText(SerachHeaderName);
	}
	  
	  public productInfoPage selectproduct(String mainProductName)
	  {
		List<WebElement> ProductList =  elementutil.waitForVisibilityOfElements(ProductResultsPage, Constants.DEFAULT_TIME_OUT);
		
		for(WebElement e : ProductList)
		{
			String text =  e.getText();
			if(text.equals(mainProductName))
					{
				
				e.click();
				break;
					}
			
	  }
		
		return new  productInfoPage(driver);
		 
		  
}
	  
	 
	public int getSearchProductListCount()
	  {
		  return elementutil.waitForVisibilityOfElements(ProductResultsPage,Constants.DEFAULT_TIME_OUT).size();
	  }
	  
	  
	  
}


