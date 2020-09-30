package project;

import org.testng.annotations.Test;

public class tc001 extends Baseclass {
	
	
	
	
	@Test
	public void testcase1()
	
		{
		driver = intializebrowser();
	    driver.get("https://www.amazon.com/");
		landingpage lp = new landingpage(driver);
		lp.clicksingin();		
		
	}

}
