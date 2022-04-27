package com.demowebshop.scripts;

import org.testng.annotations.Test;

import com.demowebshop.base.StartBrowser;
import com.demowebshop.or.Customer_ServisesOR;
import com.demowebshop.reuse.News;

public class Newsbtn extends StartBrowser{
	@Test
	public void NewsbtnTestCase() throws Exception {
		News cfs = new News();
	    cfs.Pagedown();
	    Thread.sleep(2000);
	    cfs.Newsbtn();
		Thread.sleep(5000);
	}
}
