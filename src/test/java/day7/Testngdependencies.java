package day7;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testngdependencies {
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is a Before test method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("This is a before class method");
	}
	@BeforeMethod()
	public void bm()
	{
		System.out.println("This is a before method");
	}
	@Test
	public void test()
	{
		
		Assert.assertEquals(false,true);
	}
	@Test(dependsOnMethods= {"test"})
	public void test1()
	{
		System.out.println("This is a Dependencies method");
	}
	@AfterMethod()
	public void am()
	{
		System.out.println("This is a after method");
	}

	@AfterClass
	public void ac()
	{
		System.out.println("This is a after class method");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is a After test method");
	}
	@BeforeSuite()
	public void bs()
	{
		System.out.println("This is a Before Suite  method");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("This is a After Suite  method");
	}


}
