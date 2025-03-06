package scripts;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement youtubeLink = driver.findElement(By.xpath("//div/div/a[text()='Youtube']"));
		
		
		youtubeLink.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"//screenshots//youtube.png");
		source.renameTo(target);
		Thread.sleep(2000);
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement logo = driver.findElement(By.xpath("//div/div/div[@id='header-inner']"));
		Thread.sleep(2000);
		File source2  = logo.getScreenshotAs(OutputType.FILE);
		File target2 = new File(System.getProperty("user.dir")+"//screenshots//logo.png");
		source2.renameTo(target2);
		
		
		
		
		
		
		
		
		
		
	}

}
