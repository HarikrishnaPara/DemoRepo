package com.demowebshop.reuse;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import com.demowebshop.actiondriver.Action;
import com.demowebshop.base.StartBrowser;
import com.demowebshop.or.Customer_ServisesOR;

	public class News {
		
		public Action aDriver;
		public WebDriver driver;
		
		public News()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		
		  public void Pagedown() throws Exception
		  
		  { 
		  StartBrowser.childTest =StartBrowser.parentTest.createNode("Page down");
		  aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		  Actions a=new Actions(driver);
		  a.sendKeys(Keys.PAGE_DOWN).perform();
		  a.sendKeys(Keys.PAGE_DOWN).perform();
		  }
		 
		  public void Newsbtn() throws Exception
		  {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("News button");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(Customer_ServisesOR.btnNews, "Performed click operation on News button");
		  }
	}

