package wrappers;


import java.net.MalformedURLException;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import Runner.Reportcucm;
import io.cucumber.java.en.Then;


public class ProjectWrappersdbs extends Reportcucm{
	
	public String dataSheetName,browser;
	
	@BeforeSuite
	public void beforeSuite(){
		startReport();
	}
	
	
	
@BeforeClass
	public void beforemethod() throws MalformedURLException{
	startTest(testCaseName, description);

	}



@AfterClass
    
	   public void closeAllBrowsers() {


	        try {
	            driver.close();
	            //System.out.println("Successfully closed the Browser");
	            logStep("Pass","Successfully closed browser");

	        }

	        catch (TimeoutException e) {
	            logStep("fail","The driver is throwing an exception to close the single Broswer" );
	            //System.err.println("The driver is throwing an exception to close the single Broswer" );
	        }
	     

	    }
	
@AfterSuite
public void afterSuite(){
	endTest();
	endReport();
}


	

}
