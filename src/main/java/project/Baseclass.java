package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Baseclass extends Reports{
	
	public WebDriver driver;
	
	public WebDriver intializebrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver84.exe");
		 driver = new ChromeDriver();		 	    
	    return driver;
	}

}
