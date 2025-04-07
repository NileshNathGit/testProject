package day4;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.staticTableObjects;
import environmentVariables.base;

public class staticTable {
	public static void main(String[] args) {
		
		
		WebDriver driver =base.launch();
		staticTableObjects s = new staticTableObjects(driver);
		WebElement staticTable =  driver.findElement(By.xpath("//div/h2[contains(text(),'Static Web Table')]//following-sibling::div/table/tbody"));
		WebElement dynamicTable =  driver.findElement(By.xpath("//div/h2[contains(text(),'Dynamic Web Table')]//following-sibling::div/table/tbody"));
		List<WebElement> rows = dynamicTable.findElements(By.xpath("./tr[td[text()='Chrome']]"));
		List<WebElement> hRows = s.Headers().findElements(By.xpath("./tr"));
		
		for(WebElement hr : hRows)
		{
			
			List<WebElement> cells = hr.findElements(By.tagName("th"));
			for(WebElement cell : cells)
			{
				System.out.print(cell.getText()+" | ");
			}
			System.out.println();
		}
		
		for(WebElement r : rows)
		{
			
			List<WebElement> cells = r.findElements(By.tagName("td"));
			for(WebElement cell : cells)
			{
				System.out.print(cell.getText()+" | ");
			}
			System.out.println();
		}
	
	}
	

}
