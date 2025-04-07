package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class staticTableObjects {
	
	//Objects
	@FindBy(xpath="//div/h2[contains(text(),'Static Web Table')]//following-sibling::div/table/tbody/tr/th")
	WebElement Headers;
	
	@FindBy(xpath="//div/h2[contains(text(),'Static Web Table')]//following-sibling::div/table/tbody/tr")
	WebElement rows;

//	
	@FindBy(xpath="//div/h2[contains(text(),'Static Web Table')]//following-sibling::div/table/tbody/tr/td")
	WebElement coln;
//
//	@FindBy(xpath="")
//	WebElement name;
//
//	@FindBy(xpath="")
//	WebElement name;
//
//	@FindBy(xpath="")
//	WebElement name;
//
//	@FindBy(xpath="")
//	WebElement name;
	private WebDriver driver;

	public staticTableObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public  WebElement  Headers()
	{
		WebElement header = driver.findElement(By.xpath("//div/h2[contains(text(),'Dynamic Web Table')]//following-sibling::div/table/thead"));
		return header;
	}

	
	

}
