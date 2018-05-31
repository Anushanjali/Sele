package Mavenprjct.Finanace;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class ManyLink extends BasePage{
 
	
  @BeforeClass
  @Parameters("browser")
  public void startProcess(String browser) throws Exception
  {
	  browserLaunch(browser, getData("bbcurl"));
  }

/*  @Test(priority=0,enabled=false)
  public void singleLink()
	{
	// for single we use this code :
	  driver.findElement(By.partialLinkText("Register Now")).click();
	}  
	  */
  
 /* 
  @Test(priority=1,enabled=false)
  public void multipleLinks()
	{
	List<WebElement> var=  driver.findElements(By.tagName("a"));  //use this for multiple links 
	  for(int i=0;i<var.size();i++)
	  {
		  if(!var.get(i).getText().isEmpty()) 
		  {
			  String links = var.get(i).getText();
				 System.out.println(links);
		  }
		
	  }
  }
  */
  
 /*  @Test
  public void staticHeaderLinks()
	{
	// for header all links we use this code :
	
	 WebElement header = driver.findElement(By.id("sc_hdu"));
	
	 List<WebElement> links = header.findElements(By.tagName("a"));
	
	for(int i=0;i<links.size();i++)
	{
		if(!links.get(i).getText().isEmpty()) 
		{
			if(links.get(i).getText().equals("Videos"))
			{
				
			links.get(i).click();
		}
	}
	     header = driver.findElement(By.id("sc_hdu"));
		 links = header.findElements(By.tagName("a"));
		
	}}
  */
  
  @Test
  public void dynamicLinks() throws InterruptedException
	{
	
	 WebElement header = driver.findElement(By.className("most-popular"));
	 List<WebElement> var = header.findElements(By.tagName("a"));
	
	 for(int i=0;i<var.size();i++)
		{
			String links = var.get(i).getText();
				 System.out.println(links);
				 var.get(i).click();
				 driver.navigate().back();
				 Thread.sleep(5000);
				 
				 header=driver.findElement(By.className("most-popular"));
				 var= header.findElements(By.tagName("a"));
		}
		}
	 
	
  
  
  
  @AfterClass
  public void endProcess()
  {
	  
  }

}
