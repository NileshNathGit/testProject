package environmentVariables;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	public static String url = "https://testautomationpractice.blogspot.com";
	public static WebDriver launch() {
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get(url);
	return driver;
	}
	

}
