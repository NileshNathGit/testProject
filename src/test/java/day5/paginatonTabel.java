package day5;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import environmentVariables.base;

public class paginatonTabel {

	@Test
	public void mass() {
		WebDriver driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(base.url);
		WebElement dyTable = driver.findElement(By.xpath("//div/h2[contains(text(),'Pagination Web Table')]//following-sibling::div/div/table"));
		List<WebElement> pagination = driver.findElements(By.xpath("//div/ul[@id='pagination']/li"));
		int pages = pagination.size();
		pagination.get(0).click();
		System.out.println(pages);
		List<WebElement> rows = dyTable.findElements(By.xpath("./tbody/tr"));
		List<WebElement> hrows = dyTable.findElements(By.xpath("./thead/tr"));
		for(WebElement hr : hrows)
		{		
			List<WebElement> cells = hr.findElements(By.tagName("th"));
			for(WebElement cell : cells)
			{
				System.out.print(cell.getText()+" | ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=1;i++) {

			for(WebElement r : rows)
			{
				List<WebElement> cells = r.findElements(By.tagName("td"));
				for(WebElement cell : cells)
				{
					System.out.print(cell.getText()+" | ");
				}
				System.out.println();
			}
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@id='pagination']/li["+i+"][1]"))).click();
		}

	}


}
