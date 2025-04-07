package day3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.pageObjects;

public class upAndDown {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		pageObjects p = new pageObjects(driver);
		driver.get(pageObjects.url);
		String single = System.getProperty("user.dir")+"\\src\\test\\java\\resources\\Accenture-logo.png";
		String path1 =  System.getProperty("user.dir")+"\\src\\test\\java\\resources\\Accenture-logo.png";
		String path2 =  System.getProperty("user.dir")+"\\src\\test\\java\\resources\\Accenture-logo.png";
		
		p.singleUpload(single);
		p.multiUpload(path1, path2);
				
	}

}
