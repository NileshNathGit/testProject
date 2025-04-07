package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.pageObjects;

public class date1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Dimension size = new Dimension(1080, 768);
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		pageObjects po = new pageObjects(driver);
		driver.get("https://testautomationpractice.blogspot.com");
		
		po.datePicker1("2026", "January", "2");

		String Day="2";
		String Year="2022";
		String Month="January";
		
		driver.findElement(By.xpath("//div/p[contains(text(),'Date Picker 1:')]/input")).click();
		
		
		while(true)
		{
		String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		if(monthyear.equalsIgnoreCase(Month+" "+Year))
			{break;}
		int feedyr = Integer.parseInt(Year);
		String[] ch = monthyear.split(" ");
		int fetchyr = Integer.parseInt(ch[1]);
		if(feedyr>fetchyr)
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		else
		driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
		}
		driver.findElement(By.xpath("(//td[@data-handler='selectDay']/a[contains(text(),'"+Day+"')])[1]")).click();
		
	}

}
