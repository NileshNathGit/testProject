package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.pageObjects;

public class date3 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		pageObjects p = new pageObjects(driver);
		driver.get(pageObjects.url);
		String start="02/23/2027";
		String end="02/23/2030";
		p.datePicker3(start, end);
		
	}

}
