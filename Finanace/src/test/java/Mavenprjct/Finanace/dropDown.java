package Mavenprjct.Finanace;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class dropDown extends BasePage {

	  @BeforeClass
	  @Parameters("browser")
	  public void startProcess(String browser) throws Exception
	  {
		  browserLaunch(browser, getData("amazonurl"));
	  }
	
/*	
	@Test
  public void allLink()
	{
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 WebElement var = driver.findElement(By.id("searchDropdownBox"));
		Select obj=new Select(var);
		//obj.selectByIndex(1);
		//obj.selectByVisibleText("Amazon Pantry");
		obj.selectByValue("search-alias=alexa-skills");
		WebElement val = obj.getFirstSelectedOption();
		System.out.println(val.getText());
	}
	*/
  
	  
	  
	/*  
	@Test
	  public void toPrintallOptionsInDropDown()
		{
		driver.findElement(By.id("searchDropdownBox"));
		WebElement var = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> links = var.findElements(By.tagName("option"));
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getText().equals("Books"))
			{
			System.out.println(links.get(i).getText());
			}
	  }
		}
		*/
	  
	  
	  @Test
	  public void toPrintallOptionsInDropDown()
		{
		  driver.findElement(By.id("searchDropdownBox"));
		WebElement find = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> links = find.findElements(By.tagName("option"));
		Select obj = new Select(find);
		
		for(int i=0;i<links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
			}
		}

	  
	  
	  
  @AfterClass
  public void afterClass() 
  {
	  
  }

}
