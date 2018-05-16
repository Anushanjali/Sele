package Mavenprjct.Finanace;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LinkTesting extends BasePage
{
	
@Test(groups= {"smoke","regression"})             
	  public void linkTesting() throws Exception 
	 
	  {
		  Thread.sleep(4000);
		// browserLaunch(GetValue("browser"),GetValue("flipkarturl"));
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[2]/div[1]/a")).click();
	  }
	
	
@BeforeMethod(groups= {"smoke","regression"})
    @Parameters("browser")

	public void setup(String browser) throws Exception 
	{
	 browserLaunch(browser,getData("flipkarturl"));
	
	
	}
		
 
@AfterMethod
public void killProcess()
{
 driver.close();
}
}



/*
 
if(browser.equalsIgnoreCase("CHROME"))
{

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("FIREFOX"))
	{
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
	}
else if(browser.equalsIgnoreCase("IE"))
{
	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
}
driver.get(url);// using thes we can go to the ink dats all
//	driver.manage().window().maximize();


*/