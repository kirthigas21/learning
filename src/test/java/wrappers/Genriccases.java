package wrappers;

	
	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.*;

	import org.openqa.selenium.remote.RemoteWebDriver;

import Runner.Reportcucm;
	

public class Genriccases extends Reportcucm{
	  
	    //int i=1;
	    	
	    public long takeSnap() {
	        // TODO Auto-generated method stub
	    
	    	long number = 100000l;
	    	
	    	try {
	    		number = (long) Math.floor(Math.random()*100000+100000l);
				File obj = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./images/snap"+number+".jpeg");
				FileUtils.copyFile(obj, dest);
				 //logStep("Pass","Successfully taken screenshot");
				//System.out.println("Successfully Taken a screenshot");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
	    	return number;

	    }

	  


}
