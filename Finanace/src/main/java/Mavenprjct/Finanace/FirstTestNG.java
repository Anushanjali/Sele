package Mavenprjct.Finanace;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNG {
  @Test(priority=1)
  public void f()
  {
	  System.out.println("f");
  }
  
  @Test(priority=3,enabled=false) //priority wi exe frst. enabld .. true means wil exe.. fals meaning wont exe
  public void a()
  {
	  System.out.println("a");
  }
  
  @Test(priority=2)
  public void c()
  {
	  System.out.println("c");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("aftermethod");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("aftersuite");
  }

}
