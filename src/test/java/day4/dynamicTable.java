package day4;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import environmentVariables.base;

public class dynamicTable {
	public static void main(String[] args) {
		
		WebDriver driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(base.url);
		WebElement dyTable = driver.findElement(By.xpath("//div/h2[contains(text(),'Dynamic Web Table')]//following-sibling::div/table"));
		List<WebElement> rows = dyTable.findElements(By.xpath("./tbody/tr[td[text()='Chrome']]"));
		List<WebElement> hrows = dyTable.findElements(By.xpath("./thead/tr"));
		
		for(WebElement hr : hrows)
		{
			List<WebElement> hcells = hr.findElements(By.tagName("th"));
			for(WebElement cell : hcells)
			{
			System.out.print(cell.getText()+" | ");
			}
			System.out.println();
		}
		
		for(WebElement hr : rows)
		{
			List<WebElement> hcells = hr.findElements(By.tagName("td"));
			for(WebElement cell : hcells)
			{
			System.out.print(cell.getText()+" | ");
			}
			System.out.println();
		}
	
	}

}
