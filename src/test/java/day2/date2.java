package day2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.pageObjects;

public class date2 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Dimension size = new Dimension(1080, 768);
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		pageObjects po = new pageObjects(driver);
		driver.get("https://testautomationpractice.blogspot.com");
		
//		po.datePicker1("2026", "January", "2");
		po.datePicker2("2026", "Jan", "2");
}
}
