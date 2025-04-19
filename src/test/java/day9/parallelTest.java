package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTest {
	WebDriver driver;
	@BeforeClass
//	@Parameters({"browser"})
	void setUp()
	{driver = new ChromeDriver();
//		switch(br)
//		{
//			
//		case "chrome" : driver = new ChromeDriver();
//		break;
//		case "edge" : driver = new EdgeDriver();
//		break;
//		default : return;
//		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
	}
	
	@Test(groups= {"sanity"})
	void testLogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertEquals(status, true );
		
	}
	@Test(groups={"sanity","regression"})
	void testTitle()
	{
		Assert.assertEquals( driver.getTitle(),"Google");
		
	}
	@Test(groups={"sanity","regression","functional"})
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
