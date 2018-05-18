package Mavenprjct.Finanace;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC001_LoginPage  extends BasePage
{
	
	
  @BeforeClass
  @Parameters("browser")
  public void setUp(String browser) throws Exception 
  {
	  browserLaunch(browser, getData("ecommerceurl"));
  }
	
  @Test
  public void customerLogin() 
  {
	  HomePage page=new HomePage(driver);
	  page.login();
	  Assert.assertTrue(page.verifyLoginPage().equalsIgnoreCase("My account"));
	
  }
  
  @AfterClass
  public void killProcess() 
  {
	  
  }

}
