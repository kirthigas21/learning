package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingpage {
	
	public WebDriver driver;
	
	public landingpage(WebDriver driver) {
		
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void clicksingin()
		{
		
		
		driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']")).click();
		
	}	    
		
	}


