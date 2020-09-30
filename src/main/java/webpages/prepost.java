package webpages;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;

public class prepost {
	
	public static ChromeDriver driver;
	
@BeforeMethod
		public void startapp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver7.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
	}

}
