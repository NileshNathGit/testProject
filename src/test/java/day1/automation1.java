package day1;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.pageObjects;

public class automation1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
//		System.out.println("Hello");
		WebDriver driver = new EdgeDriver();
		Dimension size = new Dimension(1080, 768);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("blogstop");
		
		pageObjects po=new pageObjects(driver);
//		po.datePicker1("2026", "January", "2");
		
		
		
		
		
		
		po.male();
		po.female();
		
		po.SelectByValue("United Kingdom");
		String aarr[]= {"Red","Blue","Green","White"};
		String rr[]= {"Cat","Cheetah","Elephant","Lion"};
		
		for(String i : aarr) {	
			
			pageObjects.selectColors(i);
	
		}
		
		pageObjects.sortedList();
		
		for(String i : rr) 
		{		
			pageObjects.selectAnimals(i);
		
		}
			
		
	}

}
