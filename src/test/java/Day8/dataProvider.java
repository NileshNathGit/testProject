package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class dataProvider 

{	
	WebDriver driver;
	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="test")
	void test(String email,String pass)
	{
		driver.get("https://teijin-test.zendesk.com/access/normal");
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_password")).sendKeys(pass);
		driver.findElement(By.id("sign-in-submit-button")).click();
	}
	@AfterClass
	void teardown()
	{
//		driver.close();
	}
	
	
	@DataProvider(name="test",indices= {0,1,3})
	Object[][] testdata()
	{
		String data [][]= {
				{"Nilesh","76500123"},
				{"Nilesh","76500122"},
				{"japanmanxyz@gmail.com","welcome"},
				{"Nilesh","76500125"}};
				
		
		return data;
	}
	
		
		
}
