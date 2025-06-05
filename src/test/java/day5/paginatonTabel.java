package day5;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
//		for(WebElement hr : hrows)
//		{		
//			List<WebElement> cells = hr.findElements(By.tagName("th"));
//			for(WebElement cell : cells)
//			{
//				System.out.print(cell.getText()+" | ");
//			}
//			System.out.println();
//		}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		

			for(WebElement r : rows) {
				List<WebElement> cells =r.findElements(By.xpath("./td[3]"));
				
				for(WebElement cell : cells) {
				try {
		            String cellText = cell.getText().replace("$", "").trim();
		            double price = Double.parseDouble(cellText);

		           

		            if (price <= 10.00 && price > 1.00) {
		               
		            	List<WebElement> nameCell =r.findElements(By.xpath("./td[2]"));
		            	int name=0;
		            	 System.out.println(nameCell.get(name).getText().trim()+ " --> 	Price is  :" + price) ;
		            	
		            }
		                
		            
		        } catch (NumberFormatException e) {
		            System.out.println("Error parsing price: " + cell.getText());
		        }
				
				
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@id='pagination']/li["+i+"][1]"))).click();
		}

	}


}}
