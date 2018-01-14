package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Utilties.ReadSystemProperties;

public class BaseConfigurations {
	
	public WebDriver driver;
	public String systempropertieslocation = ".\\configurations\\systemconfig.properties";
	
	@BeforeTest(enabled=true)
	@Parameters("BrowserName")
	public void configureBrowser(String browser){
		
		ReadSystemProperties rp = new ReadSystemProperties(systempropertieslocation); 
		
		if(browser.equals("Chrome")){
			System.setProperty(rp.getPropertyValue("CHROMEDRIVERKEY"), rp.getPropertyValue("CHROMEDRIVERVALUE"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("FF")){
			System.setProperty(rp.getPropertyValue("FFDRIVERKEY"), rp.getPropertyValue("FFDRIVERVALUE"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
	}
	
	@AfterTest(enabled=false)
	public void closeBrowsers(){
		
		driver.quit();
	}
}
